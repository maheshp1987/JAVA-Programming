<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="Connection Begin" %>
<%!
int i=0;
Connection con;
Statement stmt;
ResultSet rs;
String url = "jdbc:mysql://127.0.0.1:3306/";
String dbname = "test";
String driver = "com.mysql.jdbc.Driver";
String username = "root";
String password = "root";
%>

<%
try {
	Class.forName(driver);
}
catch(ClassNotFoundException e){
	out.println("Check Connection");
}
try{
	con = DriverManager.getConnection(url+dbname,username,password);
    out.println("Conn Open Successfully");

	String sql = "select * from register";
	
	stmt = con.createStatement();
	rs= stmt.executeQuery(sql);
	while (rs.next()){
	String email=rs.getString(1);
	String pass =rs.getString(2);
	if((request.getParameter("txtemail").equals(email)) &&
		(request.getParameter("txtpwd").equals(pass))){
		out.print("Login Successfully");
	}
	else{
		out.print("Login Failed");
	}
	}
	rs.close();
	stmt.close();
	con.close();
}

catch(SQLException e){
	out.print("Check your Query");
	e.printStackTrace();
}
%>
</body>
</html>