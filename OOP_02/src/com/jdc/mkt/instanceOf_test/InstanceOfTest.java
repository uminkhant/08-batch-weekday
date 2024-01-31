package com.jdc.mkt.instanceOf_test;

public class InstanceOfTest {

	public static void main(String[] args) {
		Shape square = new Square();
		
		Rectangle r = (Rectangle) square;
		r.createRectangle();
		//checker(r);
	}
	
	static void checkerWithIfElse(Shape s) {
		if(s instanceof Square sq) {
			Square ss = (Square) s;
			ss.createSquare();
			
			sq.show();
			
		}else if( s instanceof Rectangle r) {
			r.createRectangle();
			r.show();
		}
		
		
	}
	static void checkerWithSwitch(Shape s) {
		switch(s) {
		case Square square -> square.createSquare();
		case Rectangle rectangle -> rectangle.createRectangle();
		case null -> System.out.println("null value");
		default -> System.out.println("other");
		}
	}
	
}

class Shape{
	void show() {
		System.out.println("Super");
	}
}
class Square extends Shape{
	@Override
	void show() {
		System.out.println("Square");
	}
	void createSquare() {
		System.out.println("Creating square");
	}
}
class Rectangle extends Shape{
	@Override
	void show() {
		System.out.println("Rectangle");
	}
	void createRectangle() {
		System.out.println("Creating rectangle");
	}
}
