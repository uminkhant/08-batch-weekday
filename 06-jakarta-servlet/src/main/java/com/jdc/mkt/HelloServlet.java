package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter()
		.append("""
				<!DOCTYPE html>
					<html>
					<head>
					<meta charset="UTF-8">
					<title>Insert title here</title>
					</head>
					<body>
				""")
		.append("<h1>")
		.append("""
				Hello Servlet from servlet.
				""")
		.append("</h1>")
		.append("""
				</body>
				</html>
				""")
		.flush();
	}
	
}
