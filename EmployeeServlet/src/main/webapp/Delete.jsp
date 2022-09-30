
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Edit </title>
</head>
<body style ="font-family: Arial">
<h1> Delete an Existing Employee </h1> 
<form action="./DeleteServlet" method="post">
<table>
<tr>
<td> Employee Number to Delete: </td>
<td><input type = "text" name = "enumber"> 
</tr>
<tr>
</table> 
<button type = "submit"> Delete </button>
<button type = "reset"> Reset </button>
<button type = "button" onclick = "window.location.href = 'LandingPage.jsp'"> Return Home </button>
</form>
</body>
</html>
</body>
</html>