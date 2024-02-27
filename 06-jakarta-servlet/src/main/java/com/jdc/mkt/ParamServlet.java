package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = "/param-srv",
		name = "ParamServlet",
		initParams = {
				@WebInitParam(name="sss",value = "susu",description = "This is su su user"),
				@WebInitParam(name="ttt",value = "thida",description = "This is thida user")
		})
public class ParamServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		//parameters 
		var params = req.getParameterNames();
		while(params.hasMoreElements()) {
			var param = params.nextElement();
			System.out.println("Name :"+param+"\t"+"Value :"+req.getParameter(param));
		}
//		String name = req.getParameter("name");
//		int age = Integer.valueOf(req.getParameter("age")) ;
//		System.out.println("Parameter :"+name+"\t"+age);
		
		var names = getServletConfig(). getInitParameterNames();
		
		while(names.hasMoreElements()) {
			var n = names.nextElement();
			System.out.println("Init param name :"+n+"\t"+ getInitParameter(n));
		}
		
		//http protocol
		System.out.println("Context path :"+getServletContext().getContextPath());
		System.out.println("Servlet path :"+req.getServletPath());
		System.out.println("Path info :"+req.getPathInfo());
		System.out.println();
		
		var headers = req.getHeaderNames();
		
		while(headers.hasMoreElements()) {
			var header = headers.nextElement();
			System.out.println(header+": \t"+req.getHeader(header));
		}
		
		//servlet
		System.out.println("Servlet Name :"+getServletName());
			
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
		.append("<h3>")
		//.append("Name :"+name)
		.append("</h3>")
		.append("<h3>")
		//.append("Age :"+age)
		.append("</h3>")
		.append("</body></html>")
		.flush();
	}
}
