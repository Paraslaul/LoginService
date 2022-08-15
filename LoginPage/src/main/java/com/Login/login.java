package com.Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Login.dao.LoginDAO;


@WebServlet("/login")
public class login extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname = request.getParameter("uname");
	String pass = request.getParameter("pass");
	LoginDAO dao = new LoginDAO();
	if(dao.check(uname,pass)) {
		HttpSession session = request.getSession();
		session.setAttribute("name",uname);
		response.sendRedirect("welcome.jsp");
	}
	else {
		response.sendRedirect("login.jsp");
	}
	}

	
}
