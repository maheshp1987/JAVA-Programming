package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetParameterNamesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		String title = "All Request Parameter";
		out.println("<html><body>");
		out.println("<h1>"+title+"</h1> <br>");
		Enumeration paramNames=request.getParameterNames();
		while(paramNames.hasMoreElements()){
			String param =(String)paramNames.nextElement();
			out.println(param + ":");
			String[] paramValues= request.getParameterValues(param);
			if(paramValues.length == 1){
				String paramVal = paramValues[0];
				if(paramVal.length() == 0)
					out.println("No Values <br>");
				else
					out.println(paramVal +"<br>");
			}
			else{
				for(int i=0;i<paramValues.length;i++){
					out.println(paramValues[i] + "<br>");
				}
			}
			
		}
		out.println("</body></html>");
		
	}

}
