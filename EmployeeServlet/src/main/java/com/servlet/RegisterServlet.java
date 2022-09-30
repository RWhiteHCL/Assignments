package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Create the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root"); 
		//Query statement to insert the values		
		PreparedStatement psa = con.prepareStatement("insert into emp values(?,?,?)"); 
			psa.setInt(1, Integer.valueOf(request.getParameter("enumber")));
			psa.setString(2, request.getParameter("ename"));
			psa.setInt(3, Integer.valueOf(request.getParameter("esalary")));

			psa.execute();
			con.close();
			
			response.sendRedirect("Success.jsp?msg=Register");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

}
