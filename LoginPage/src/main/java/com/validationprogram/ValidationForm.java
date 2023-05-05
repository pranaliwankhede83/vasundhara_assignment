package com.validationprogram;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationForm
 */
@WebServlet("/ValidationForm")
public class ValidationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ValidationForm() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out  = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/validationform","root","root");
			
			String name= request.getParameter("username");
			String pass= request.getParameter("password");
			
			PreparedStatement pstmt= con.prepareStatement("select username from login where username=? and password=?");
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request,response);
			}
			else {
				out.println("<font color=red size=20>Login Failed<br>");
				out.println("<a href = Login.jsp>Try Again</a>");
			}
		}
		 catch(ClassNotFoundException e) {
         e.printStackTrace();
		 }
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	}

}
