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

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root");
			// Query statement to edit the values
			PreparedStatement psd = con.prepareStatement("delete from emp where eno = ?");

			psd.setInt(1, Integer.valueOf(request.getParameter("enumber")));

			psd.execute();
			response.sendRedirect("Success.jsp?msg=Delete");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
