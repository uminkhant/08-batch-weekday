package com.jdc.mkt.lambda;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

public class MethodReferenceTest {

	@Test
	void testSeeker() {
		
		//use lambda
		Seeker seek = t -> System.out.println(t);
		seek.jobSeeker("Find job");
		
		//instance method reference
		Job job = new Job("test");
		Seeker seek1 = job::findOut;
		seek1.jobSeeker("Use find out ");
		
		//static method reference
		Willing will = Job::getMessage;
		String message = will.getWilling();
		System.out.println("My willing ::"+message);
		
		Willing w = () -> "I will find out by myself ";
		System.out.println(w.getWilling());
		
		//use constructor
		Consumer<String> s = Job::new;
		//s.jobSeeker("Hello");
		s.accept("hello");
	}
	
	
}

class Job{
	Job(String message){
		System.out.println("Use constructor ::"+message);
	}
	static String getMessage() {
		return "I will find out by myself ";
	}
	void findOut(String message) {
		System.out.println("findOut ::"+message);
	}
}

@FunctionalInterface
interface Willing{
	String getWilling();
}

@FunctionalInterface
interface Seeker{
	void jobSeeker(String type);
	
}
