package com.jdc.mkt.interface_test;

public class Main {
	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.draw();
		s.setColor("green");
		s.hide();
		
		Shape.show();
		int i = Shape.VALUE;
		System.out.println("Value from interface : "+i);
	}
}

class Rectangle extends WhiteBoard implements Shape,Pen {

	@Override
	public void draw() {
		System.out.println("Draw rectangle");
	}

	@Override
	public void setColor(String color) {
		System.out.println("Color :"+color);
	}

	@Override
	public void usePen() {
		System.out.println("Rectangle use pen");
	}

	@Override
	void useWhiteBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public C getTestReturn() {
		return (C) new B();
	}
}
abstract class WhiteBoard{
	abstract void useWhiteBoard();
}

interface Pen{
	void usePen();
}
interface Shape {
	//static final 
	int VALUE = 30;
	
	//we don't need abstract keyword
	 void draw();
	 void setColor(String color);
	 B getTestReturn();
	 
	 static void show() {
		 System.out.println(VALUE);
	 }
	 default void hide() {
		 System.out.println(VALUE);
	 }
	 
	 
	 
}

class A{}
class B extends A{}
class C extends B{}






