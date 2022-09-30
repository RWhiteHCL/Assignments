package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");
			// Query statement to edit the values
			PreparedStatement psu = con.prepareStatement("update emp set ename = ?, esal = ? where eno = ?");

			psu.setString(1, request.getParameter("ename"));
			psu.setInt(2, Integer.valueOf(request.getParameter("esalary")));
			psu.setInt(3, Integer.valueOf(request.getParameter("enumber")));

			psu.execute();

			response.sendRedirect("Success.jsp?msg=Edit");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
