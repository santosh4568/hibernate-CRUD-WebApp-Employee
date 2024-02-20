package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import helper.FactoryProvider;
import model.EmployeeWeb;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameString = request.getParameter("naam");
		int idString = Integer.parseInt(request.getParameter("id"));
		String deptString = request.getParameter("dept");
		Session session = FactoryProvider.getFactory().openSession();
		try {
			session.beginTransaction();
			EmployeeWeb emw = session.get(EmployeeWeb.class, idString);
			if(emw!=null) {
				emw.setDeptString(deptString);
				emw.setIdString(idString);
				emw.setNameString(nameString);
				
				session.merge(emw);
				
				response.setContentType("text/html");
        		PrintWriter out = response.getWriter();
            	out.println("<h1 style='text-align:center; color : green ;'>Employee Updated </h1>");
        		out.println("<h1 style='text-align:center;'><a href='displayEmp.jsp'>View all Employee</a></h1>");
			}
			else {
				response.setContentType("text/html");
        		PrintWriter out = response.getWriter();
            	out.println("<h1 style='text-align:center; color : red ;'>Employee Not Found</h1>");
        		out.println("<h1 style='text-align:center;'><a href='displayEmp.jsp'>View all Employee</a></h1>");
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		session.close();
	}

}
