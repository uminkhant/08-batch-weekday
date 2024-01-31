package com.jdc.mkt.solid;

public class DIPrinciples {

	public static void main(String[] args) {
		Computer cu = new Computer(new WirelessKeyboard(),new AcerMonitor());
		cu.createComputer();
	}
}

interface Keyboard{
	void getKeyBoard();
}
interface Monitor{
	void getMonitor();
}
class WirelessKeyboard implements Keyboard{

	@Override
	public void getKeyBoard() {
		System.out.println("Use wireless keyboard");
	}
	
}

class StandardKeyboard implements Keyboard{
	public void getKeyBoard() {
		System.out.println("Use standard keyboard");
	}
}
class AcerMonitor implements Monitor{
	public void getMonitor() {
		System.out.println("Use acer monitor");
	}
}
class Computer{
	private Keyboard keyboard;
	private Monitor monitor;
	
	Computer(Keyboard keyboard,Monitor monitor){
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
	
	void createComputer() {
		keyboard.getKeyBoard();
		monitor.getMonitor();
	}
	
}
