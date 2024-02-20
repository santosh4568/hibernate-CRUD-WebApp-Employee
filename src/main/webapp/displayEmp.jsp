<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="model.EmployeeWeb" %>
<%@ page import="helper.FactoryProvider" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Employee</title>
    <style>
    	body{
	        background-image: url("images/ds.webp");
	        background-size:cover;
    	}
        h1{
            text-align: center;
        }
        tr,td{
            border: 2px solid;
        }
        table{
            text-align: center;
            margin-left: 30%;
            width: 50%;
            border: 2px solid;
        }
        a{
            margin-left: 50%;
        }
    </style>
</head>
<body>
    <h1><u>EMPLOYEE'S DETAILS</u></h1>
    <table>
        <tr>
            <td><b>Employee's ID</b></td>
            <td><b>Employee's Name</b></td>
            <td><b>Employee's Department</b></td>
        </tr>
         <% 
   
            Session session2 = FactoryProvider.getFactory().openSession();
            
            try {
                session2.beginTransaction();
                List<EmployeeWeb> Empres = session2.createQuery("from EmployeeWeb").getResultList();
                
                for (EmployeeWeb emp_var : Empres) {
        %>
                <tr>
                    <td><%= emp_var.getIdString() %></td>
                    <td><%= emp_var.getNameString() %></td>
                    <td><%= emp_var.getDeptString() %></td>
                </tr>
        <%
                }
                session2.getTransaction().commit();
            } finally {
            	session2.close();
            }
        %>
        
    </table>
    <a href="index.jsp">HOME</a>
</body>
</html>