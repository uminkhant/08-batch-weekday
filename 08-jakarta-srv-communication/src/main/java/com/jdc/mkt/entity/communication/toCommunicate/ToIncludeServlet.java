package com.jdc.mkt.entity.communication.toCommunicate;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns = "/toInclude",name = "toIncludeName")
public class ToIncludeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getServletContext().getRequestDispatcher("/header").include(req, resp);
		resp.getWriter()
		.append("<h3>")
		.append("This is from toInclude servlet")
		.append("</h3>")
		.flush();
	}

}
