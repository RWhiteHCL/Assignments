<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>
<%=request.getParameter("msg") + " Succesful" %></h3>
<button type="button" onclick = "window.location.href = 'LandingPage.jsp'"> Return to Home </button>
</body>
</html>