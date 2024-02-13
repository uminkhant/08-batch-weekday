package com.jdc.mkt.lambda;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LambdaTest {

	interface Runner{
		int run(String messge,int age);
		static void show() {}
		default void hide() {}
	}
	
	@Test
	void beforeAndAfterLambdaTest() {
		before();
		after();
		List<String> l = new ArrayList<String>(List.of("a","b","c"));
		l.forEach(e -> System.out.println(e));
	}
	
	private void after() {
		Runner runner =   (b,a)->  a;
		
		int age = runner.run( "Run with lambda",20);
		System.out.println(age);
	}
	
	private void before() {
		var runner = new Runner() {			
			@Override
			public int run(String message,int age) {
				System.out.println(message);
				return age;
			}
		};
		int age = runner.run("Run with anynomous class",20);
		System.out.println(age);
	}
	
}




