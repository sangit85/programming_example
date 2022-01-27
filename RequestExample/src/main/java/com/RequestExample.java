package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;


/**
 * Servlet implementation class RequestExample
 */
@WebServlet("/RequestExample")
public class RequestExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void doPost(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html");
			
			PrintWriter pw=res.getWriter();  
			  
			String firstname=req.getParameter("firstname");//will return value
			String lastname=req.getParameter("lastname");
			
			pw.println("First name"+firstname+"<br>");
			pw.println("Second name"+lastname);
			  
			pw.close();  
			}
	
	
    public RequestExample() {
        super();
        // TODO Auto-generated constructor stub
    }

}
