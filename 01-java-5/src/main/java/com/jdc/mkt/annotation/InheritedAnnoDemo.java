package com.jdc.mkt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class InheritedAnnoDemo {
	public static void main(String[] args) {
		System.out.println(
				SubPerson.class
				.getAnnotation(Worker.class).name());
	}
}

@Worker(name = "Human class")
class Human {
	
}

class SubPerson extends Human {
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@Inherited
@interface Worker {
	String name() default "No name";
}
