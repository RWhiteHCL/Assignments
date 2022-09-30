<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Register </title>
</head>
<body style="font-family: Arial">
<h1> Register a New Employee</h1> 
<form action = "./RegisterServlet" method = "post">
<table>
<tr>
<td> Employee Number: </td>
<td><input type = "text" name = "enumber"> 
</tr>
<tr>
<td> Employee Name: </td>
<td><input type = "text" name = "ename"> 
</tr>
<tr>
<td> Employee Salary: </td>
<td><input type = "text" name = "esalary">
</tr>
</table>
<input type = "submit" value = "Register"> 
<button type = "reset"> Reset </button>
<button type = "button" onclick = "window.location.href = 'LandingPage.jsp'"> Return Home </button>
</form>
</body>
</html>