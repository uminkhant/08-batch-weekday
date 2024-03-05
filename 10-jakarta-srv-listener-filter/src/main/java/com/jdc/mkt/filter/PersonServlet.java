package com.jdc.mkt.filter;

import java.io.IOException;

import com.jdc.mkt.Person;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PersonServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("================== start person servlet");
		System.out.println("Person from req :"+ (Person)req.getAttribute("person"));
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
