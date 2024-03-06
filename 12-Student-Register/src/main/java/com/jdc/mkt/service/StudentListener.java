package com.jdc.mkt.service;

import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.entity.Student;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class StudentListener implements ServletContextAttributeListener{

	private List<Student> students;
	public StudentListener() {
		System.err.println("Listener obj start");
		students = new ArrayList<Student>();
	}
	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.err.println("student add");
		var app = event.getServletContext();
		students.add((Student)app.getAttribute("student"));
		System.out.println(students);
		app.setAttribute("students", students);
	}
}
