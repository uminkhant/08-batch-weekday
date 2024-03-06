package com.jdc.mkt.service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import com.jdc.mkt.entity.Address;
import com.jdc.mkt.entity.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
		"/student/add",
		"/student/show",
		"/student/student-save"
})
public class StudentServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var name = req.getParameter("name");
		var email = req.getParameter("email");
		var dob = getDob(req.getParameter("date"));
		var student = new Student(1,name,email,dob,new Address(),List.of("09234234"));
		getServletContext().setAttribute("student", student);
		req.getRequestDispatcher("/addStudent.jsp").forward(req, resp);
	}
	
	private LocalDate getDob(String date) {
		return LocalDate.parse(date);
	}
	
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
