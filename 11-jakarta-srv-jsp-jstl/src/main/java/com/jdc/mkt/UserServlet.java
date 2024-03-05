package com.jdc.mkt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/user-save","/user/jsp","user/el"},loadOnStartup = 1)
public class UserServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private List<User> list;
	
	public UserServlet() {
		list = new ArrayList<User>();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch(req.getServletPath()) {
		case "/user/jsp":
			req.setAttribute("list", list);
			req.getRequestDispatcher("/home.jsp").forward(req, resp);
			break;
		case "/user/el":
			req.getRequestDispatcher("/expression.jsp").forward(req, resp);
			break;
		default:			
			break;
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var name = req.getParameter("name");
		var email = req.getParameter("email");
		var pass = req.getParameter("pass");
		
		var user = new User(name,email,pass);
		list.add(user);
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/home.jsp").forward(req, resp);
	}

}
