package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<html> <body>");
		pw.println("<h1> Servlet Information </h1><br>");
		pw.println("<br> Server name"+request.getServerName());
		pw.println("<br> Server Port"+request.getServerPort());
		pw.println("<br> Server path"+request.getServletPath());
		
		pw.println("<br> Client Browser:" +request.getHeader("User-Agent"));
		pw.println("<br> Client Referer:" +request.getHeader("Host"));
		pw.println("<br> Client IP:" +request.getRemoteAddr());
		pw.println("<br> Client User :" +request.getRemoteUser());
		pw.println("<br> Server OS version:" +System.getProperty("os.version"));
		pw.println("</html> </body>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
