package com.jdc.mkt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class AnnotationDemo {
	
	void main() throws NoSuchFieldException, SecurityException {
//		Student s = new Student();
//		s.doSomething("Name :"+ null);
//		s.getFieldValue();
		
		
	}	
}
@MyAnno(value = "Nobody",day = Day.MON)
class Person{}

class Student extends Person{
	@MyAnno(day = Day.TUE,value = "Super")
	Student(){}
	
	@MyAnno(value = "Aung Aung",day = Day.MON)
	private String name;
	
	@MyAnno(day = Day.SAT,value = "Worker")
	 void doSomething(@MyAnno(day = Day.SAT,value = "Student") String name) {
		System.out.println(name);
	}
	
	public void getFieldValue() throws NoSuchFieldException, SecurityException {
		Field f = Student.class.getDeclaredField("name");
		MyAnno ano = f.getAnnotation(MyAnno.class);
		if(null != ano) {
			System.out.println(ano.value()+"\t"+ano.day());
		}
	}
}

@Retention(RetentionPolicy.RUNTIME)
@Target(value ={
	ElementType.METHOD,
	ElementType.FIELD,
	ElementType.CONSTRUCTOR,
	ElementType.PARAMETER,
	ElementType.TYPE_USE
	})
@Inherited
@interface MyAnno{
	//String getName();
	String[] value();
	Day[] day();
}
enum Day{
	SUN,MON,TUE,WED,THUR,FRI,SAT;
}






