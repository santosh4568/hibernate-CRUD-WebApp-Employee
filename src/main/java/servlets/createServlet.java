package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import helper.FactoryProvider;
import model.EmployeeWeb;

/**
 * Servlet implementation class createServlet
 */
@WebServlet("/createServlet")
public class createServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameString = request.getParameter("naam");
		int idString = Integer.parseInt(request.getParameter("id"));
		String deptString = request.getParameter("dept");
		EmployeeWeb emw = new EmployeeWeb();
		emw.setDeptString(deptString);
		emw.setIdString(idString);
		emw.setNameString(nameString);
		
		Session session = FactoryProvider.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(emw);
		tx.commit();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align:center; color : green ;'>Employee is added successfully</h1>");
		out.println("<h1 style='text-align:center;'><a href='displayEmp.jsp'>View all Employee</a></h1>");
	}

}
