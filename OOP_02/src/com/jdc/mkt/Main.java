package com.jdc.mkt;

import java.util.Scanner;

import com.jdc.mkt.another.Human;
import com.jdc.mkt.another.Teacher;

public class Main {

	static Person p ;
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		showPersonType();
		System.out.println("Select One Type !");
		p =  workType(sc.nextInt());
		p.doWork();
		p.eat();
		
		Human h = new Teacher();
		//h.doSomething();
		
	}
	
	static void showPersonType() {
		System.out.println("""
					1.Student
					2.Employee
					3.Manager
				""");
	}
	
	static Person workType(int type) {
		return switch(type) {
		case 1 -> new Student();
		case 2 -> new Employee();
		case 3 -> new Manager();
		default -> null;
		};
	}
}
