package com.jdc.mkt.generic;

public class BoundedTypeDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Bound<Integer> b1 = new Bound<>();
		useType(new B());
	}
	
	static <T extends B>void useType(T t) {
		
	}
}
class A{}
class B extends A{}
class C extends B{}

class Bound<T extends Number>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
