package com.jdc.mkt.polymorphism;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		D d1 = new D();
		C d2 = d1;
		B d3 = d1;
		A d4 = d1;
		Object d5 = new D();
		
		A a1 = new D();
		A a2 = new C();
		A a3 = new B();
		A a4 = new A();
				
	}
}

class A{
	void show() {
		System.out.println("Super A");
	}
}
class B extends A{
	void show() {
		System.out.println("B");
	}
}
class C extends B{}
class D extends C{}
