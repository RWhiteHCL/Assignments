<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>
</head>
<body style="font-family: Arial">
	<h2> Results </h2>
	<%
		try {
			//Create the connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");
			PreparedStatement psv = con.prepareStatement("Select * from emp where eno = ?");
			psv.setInt(1, Integer.valueOf(request.getParameter("enumber")));

			ResultSet rs = psv.executeQuery();

			while (rs.next()) {
	%>
	Employee Number: <%=rs.getInt("eno")%> <br> 
	Employee Name: <%=rs.getString("ename")%> <br>
	Employee Salary: <%=rs.getInt("esal")%> <br><br><br>
	<%
 	}
 	} catch (Exception e) {
 		e.printStackTrace();
 	}
 %>

		<button type="button"
			onclick="window.location.href = 'LandingPage.jsp'">Return to
			Database</button>
</body>
</html>