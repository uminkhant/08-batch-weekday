package com.jdc.mkt.inheritance;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		B b = new B();
//		//b.name = "James Goslings";
//		b.doSomething();
//		
//		A a = new B();	
//		B bb = (B) new A();
//		bb.doSome();
//		
//		//a.name = "";
//		a.doSomething();
//		Object obj = new B();
//		//obj.doSomething();
//		
//		C c = new C();
//		c.doSome();
//		c.doSomething();
		
		//using this
		//A aa = new A();
		
		//using super
		B b = new B();
	}
}

class A{
	@SuppressWarnings("unused")
	private String name;
	
	A(){
		this("Bill Joy");
	}
	
	A(String name){
		this(name,20);
		//System.out.println("Using this name : "+name);
		
	}
	
	A(String name, int age){
		System.out.println("Using this and super with name  and age : "+name+"\t"+age);
	}
	
	void doSomething() {
		doSomething();
		//this.name = "This ";
		
	}
	
	
}
class B extends A{
	B(){
		super("John",30);
	}
	void doSome() {
		
	}
}

class C extends B{}





