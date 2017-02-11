package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class GetValuesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first=request.getParameterValues("color")[0];
		PrintWriter pw=response.getWriter();
		pw.println("First Color"+first);
		
		String[] allColor=request.getParameterValues("color");
		for(int i=0;i<allColor.length;i++){
			pw.println("You Have Selected these Colors"+allColor[i]+"<br>");
		}
		pw.close();
	}
}
