
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
</head>
<body style="font-family:Arial">
	<h1>Employee Database</h1>
	<form action="Search.jsp" method="post">
		<table> 
			<tr>
				<td><input type="text" name="enumber" placeholder="Employee Number">
					<button type="submit">Search</button>
					<button type="reset">Reset</button>
		<button type="button"
			onclick="window.location.href = 'LandingPage.jsp'">Return
			Home</button>	
			</tr>
			<tr>
		</table>		
	</form>

	<!-- Create Connection -->


	<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	%>

	<!-- Format Header and Column Header -->
	<table>
		<tr style="background-color: #189AB4; font-family: Helvetica; color: white; 
		font-weight: bold; cell-padding: 20px; padding: 12px 15px">
			<td>Employee Number</td>
			<td>Employee Name</td>
			<td>Employee Salary</td>
		</tr>

		<!--  Retrieve Data -->
		<tr>
			<%
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");
					PreparedStatement pss = con.prepareStatement("Select * from emp");

					ResultSet rs = pss.executeQuery();

					while (rs.next()) {
			%>
			<td style = "background-color:#f0f8ff"><%=rs.getInt("eno")%></td>
			<td style = "background-color:#f0f8ff"><%=rs.getString("ename")%></td>
			<td style = "background-color:#f0f8ff"><%=rs.getInt("esal")%></td>

		</tr>
		<%
			}

			} catch (Exception e) {
				e.printStackTrace();
			}
		%>
	</table>



	</table>
</body>
</html>
</body>
</html>