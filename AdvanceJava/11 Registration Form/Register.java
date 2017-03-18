package com.register;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Register extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass1 = request.getParameter("pass1");
        String pass2=request.getParameter("pass2");
        if(pass1.equals(pass2)){
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost:3306/test","root","root");

        PreparedStatement ps=con.prepareStatement
                  ("insert into student (name,email,password) values (?,?,?)");

        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, pass1);
        int i=ps.executeUpdate();
        
          if(i>0)
          {
            out.println("You are sucessfully registered");
          }
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
        }
        else{
        	out.println("Password mismatch. Please Enter both password carefully");
        	RequestDispatcher rs = request.getRequestDispatcher("register.html");
            rs.include(request, response);
        }
      }
  }