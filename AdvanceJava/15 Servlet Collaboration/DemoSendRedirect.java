package com.servlet.collaboration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
  
public class DemoSendRedirect extends HttpServlet{  
private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request,HttpServletResponse response)  
throws ServletException,IOException  
{  
response.setContentType("text/html");  
PrintWriter pw=response.getWriter();  
  
response.sendRedirect("http://www.google.com");  
  
pw.close();  
}}  