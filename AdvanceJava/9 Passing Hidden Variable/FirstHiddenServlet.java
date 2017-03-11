package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstHiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstHiddenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String name=request.getParameter("userName");  
	        out.print("Welcome "+name);  
	          
	        //creating form that have invisible textfield  
	        out.print("<form action='SecondHiddenServlet'>");  
	        out.print("<input type='hidden' name='uname' value='"+name+"'>");  
	        out.print("<input type='submit' value='Submit'>");  
	        out.print("</form>");  
	        out.close();  
	  
	                }catch(Exception e){System.out.println(e);}  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
