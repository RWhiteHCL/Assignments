package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");
			// Query statement to edit the values
			PreparedStatement pss = con.prepareStatement("select * from emp where eno = ?");
			pss.setInt(1, Integer.valueOf(request.getParameter("enumber")));

			ResultSet rs = pss.executeQuery();

			while (rs.next()) {
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				int esal = rs.getInt("esal");

				System.out.println("Employee Number: " + eno);
				System.out.println("Employee Name: " + ename);
				System.out.println("Employee Salary: " + esal);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
