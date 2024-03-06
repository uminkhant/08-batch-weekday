package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
		"/student/add",
		"/student/show"
})
public class StudentServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "index";
		switch(req.getServletPath()) {
		case"/student/add":
			name = "/addStudent";
			break;
		case"/student/show":
			name = "/showStudent";
			break;
			default:
				break;
		}
		req.getRequestDispatcher(name.concat(".jsp")).forward(req, resp);
	}

}
