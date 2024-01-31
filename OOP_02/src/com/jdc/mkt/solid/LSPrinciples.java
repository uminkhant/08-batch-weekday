package com.jdc.mkt.solid;

public class LSPrinciples {

	public static void main(String[] args) {
		Car car = new MotorCar();
		car.startEngine();
		car.speedUp();
	}
}
class ElectricCar implements Car{

	@Override
	public void startEngine() {
		//throw new error
	}

	@Override
	public void speedUp() {
		
	}
	
}
class MotorCar implements Car{

	private Engine engine;
	
	MotorCar(){
		this.engine = new Engine();
	}

	@Override
	public void startEngine() {
		engine.on();
	}
	@Override
	public void speedUp() {
		engine.speedUp(120);
	}
	
}
class Engine{
	void on() {
		System.out.println("starting engine On");
	}
	
	void speedUp(double speed) {
		System.out.println("Speeding up to "+speed+"km/h");
	}
}
interface Car{
	void startEngine();
	void speedUp();
}
