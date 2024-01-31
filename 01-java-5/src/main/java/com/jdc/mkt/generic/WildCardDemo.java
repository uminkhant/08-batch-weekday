package com.jdc.mkt.generic;

public class WildCardDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WildCardContainer<String> c1 = new WildCardContainer<>();
		c1.setT("Hello");
		show(c1);
		WildCardContainer<?> c2 = new WildCardContainer<>();
		//c2.setT("");
		
		//upper bond and lower bond
		WildCardContainer<X> c3 = new WildCardContainer<>();		
		WildCardContainer<Y> c4 = new WildCardContainer<>();
		WildCardContainer<Z> c5 = new WildCardContainer<>();
		
		upperBond(c3);
		lowerBond(c5);
		
	}
	static void upperBond(WildCardContainer<? super Y> upper) {
		//upper.setT("");
	}
	static void lowerBond(WildCardContainer<? extends Y> lower) {
		//lower.setT("");
	}
	
	static void show(WildCardContainer<?> c) {
		//c.setT("");
		c.show();
	}
}

class X{}
class Y extends X{}
class Z extends Y{}

class WildCardContainer<T> {
	private T t;

	void setT(T t) {
		this.t = t;
	}

	void show() {
		System.out.println(t);
	}
}
