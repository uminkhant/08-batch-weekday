package com.jdc.mkt.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/student/post/*")
public class StudentFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		LocalDate dob = LocalDate.parse(request.getParameter("date"));
		var age = Period.between(dob, LocalDate.now()).getYears()+1;
		System.err.println("Filter start "+ age);
		if(18 <= age) {
			chain.doFilter(request, response);
		}else {
			request.getRequestDispatcher(request.getServletContext().getContextPath().concat("/commons/error.jsp")).forward(request, response);
		}
	}

}
