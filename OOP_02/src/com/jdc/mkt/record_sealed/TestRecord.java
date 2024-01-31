package com.jdc.mkt.record_sealed;

public class TestRecord {
	public static void main(String[] args) {
		Member m = new Member("John");
		System.out.println(m.name()+"\t"+m.age());
	}
}

interface Work{
	void show();
}
class Student{
	
}
record Member(String name,int age) implements Work {
	
	Member{
		if(null == name) {
			System.out.println("Not allowed null");
			name = "";
			
		}
		if(age <= 0) {
			System.out.println("Must greater than 0");
		}
	}

	Member(String name){
		this(name,0);
	}
	
	@Override
	public void show() {
		//cause of final
		//name = "";
	}
	
	public String name() {
		//to be modified
		return null;
	}
	static class Teacher{}
	class Student{}
}
