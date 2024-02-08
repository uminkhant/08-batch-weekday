package com.jdc.mkt.exception;

import org.junit.jupiter.api.Test;

public class ExceptionTest {

	static Student student;

	private Student getStudent() {
		return student;
	}

	private void setName(String name)  {
		student.setName(name);
	}

	@Test
	void test() {
		try {
			setName("Aung Aung");
			var name = getStudent().getName();
			System.out.println(name);
		} catch (NullPointerException e) {
			System.out.println("ss");
		}

	}

	class Student {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
