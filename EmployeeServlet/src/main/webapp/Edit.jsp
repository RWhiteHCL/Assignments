
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Edit </title>
</head>
<body style="font-family: Arial">
<h1> Edit an Existing Employee [By Employee Number]</h1> 
<form action= "./EditServlet" method="post">
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
<button type = "submit"> Edit </button>
<button type = "reset"> Reset </button>
<button type = "button" onclick = "window.location.href = 'View.jsp'"> Return Home </button>
</form>
</body>
</html>
</body>
</html>