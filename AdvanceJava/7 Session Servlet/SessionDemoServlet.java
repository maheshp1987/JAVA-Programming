package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		out.println("<html><body> <b> Session Information </b>");
		out.println("Session ID = "+session.getId()+"<br>");
		out.println("Session Timeout period is = "+session.getMaxInactiveInterval()+"seconds <br>");
		out.println("Now session timeout change to 20 min <br>");
		session.setMaxInactiveInterval(20*60);
		out.println("New Session Timeout period is = "+session.getMaxInactiveInterval()+"seconds <br>");
		out.println("Session creation time = "+session.getCreationTime()+"<br>");
		out.println("Session Lasst Accessed Time = "+session.getLastAccessedTime()+ "<br>");
		out.println("</html></body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
