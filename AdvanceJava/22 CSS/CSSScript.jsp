<%@page language="java" session="true" 
contentType="text/html;charset=ISO-8859-1" %> 

<html>
<font color="blue">Please Enter User Name and Password </font><br><br>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Implementing css and javascript</title>

<link rel="stylesheet" href="../css/style.css" type="text/css"></link>
</head>
<body>
<form enctype="multipart/form-data" method="post" action="WelcomeUserCSS.html">
  <table border = "1">
  <tr align="left" valign="top">
  <td>User Name:</td>
  <td><input type="text" name ="user" class="inputbox"/></td>
  </tr>
  <tr align="left" valign="top">
  <td>Password:</td>
  <td><input type="password" name ="pass" class="inputbox"/></td>
  </tr>
  <tr align="left" valign="top">
  <td></td>
  <td><input type="submit" name="submit" 
  value="submit" class="submitButton"/></td>
  </tr>
  </table>
</form>
</body>
</html>