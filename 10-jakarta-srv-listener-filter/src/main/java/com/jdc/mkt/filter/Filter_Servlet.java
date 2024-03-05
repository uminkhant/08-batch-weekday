package com.jdc.mkt.filter;

import java.io.IOException;

import com.jdc.mkt.Person;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class Filter_Servlet implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Do Filter starting !");
		HttpServletRequest req = (HttpServletRequest) request;
		
		var person =(Person) req.getAttribute("person");
		
		if(null == person) {
			request.setAttribute("person", new Person("filter", 20));
			chain.doFilter(request, response);
		}
		req.getRequestDispatcher("/error.jsp").forward(request, response);
	}

}
