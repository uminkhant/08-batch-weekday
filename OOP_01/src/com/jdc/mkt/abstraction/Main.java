package com.jdc.mkt.abstraction;

public class Main {
	
	static Animal an;
	
	public static void main(String[] args) {
		Shape s = new Square(30,20);
		s.setColor("Green");
		s.show();
		System.out.println("Area : "+ s.getArea()+"\t"+s.getColor());
		
		Shape s1 = new Shape() {
			private String color;
			@Override
			public void setColor(String color) {
				this.color = color;
			}
			
			@Override
			public String getColor() {
				return color;
			}
		};
		
		an = new Cat();
	}
}

class Square extends Shape{
	private String color;

	public Square(double width ,double height) {
		super(width,height);
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return "Square with "+color;
	}	
}

 final class Rectangle extends Shape{
	private String color;
	public Rectangle(double width,double height) {
		super(width,height);
	}
	
	@Override
	public String getColor() {
		return "Rectangle with "+color;
	}
	@Override
	public void setColor(String color) {
		this.color = color;
	}
	
}
 class Another{
	 void show() {}
 }
 abstract class Shape extends Another{
	private double width;
	private static double height;
		
	public Shape() {}
	public Shape(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	public abstract void setColor(String color);
	public abstract String getColor();
	
	public double getArea() {
		return width*height;
	}
}