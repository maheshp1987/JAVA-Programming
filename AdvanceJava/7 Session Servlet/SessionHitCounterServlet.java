package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionHitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession();
	    Integer counter=(Integer)session.getAttribute("mycounter");
	    response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(counter == null){
			counter = new Integer(0);
			out.print("Thank you");
		}
		else{
			String uname=request.getParameter("txtName");
			if(uname != null)
				 session.setAttribute("who", uname);
			else
				 uname=(String)session.getAttribute("who");
			
			counter= new Integer(counter.intValue() + 1);
			out.print("Welcome Back "+uname);
			out.println("This is visit no =  "+counter+"for this page <br>");
		}
		session.setAttribute("mycounter", counter);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
