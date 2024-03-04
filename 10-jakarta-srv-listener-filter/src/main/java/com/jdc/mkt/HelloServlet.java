package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		var app  = getServletContext();
		switch(req.getServletPath()) {
		case"/listener/add":
			req.setAttribute("message", "application obj");
			app.setAttribute("message", "application obj");
			break;
		case"/listener/replaced":
			req.setAttribute("message", "replaced application obj");
			app.setAttribute("message", "replaced application obj");
			break;
		case"/listener/removed":
			req.removeAttribute("message");
			app.removeAttribute("message");
			break;
		}	
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
	}

}
