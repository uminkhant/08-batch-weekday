package com.jdc.mkt.inheritance;

import com.jdc.mkt.inheritance.otherPkg.Bird;

public class MethodOverriding {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Animal an = new Animal();
		Animal cat = new Lion();
		cat.sleep("dd");
		Bird b = new Bird();
		b.sleep(null);
		
	}
}

class Lion extends Animal{
	
	@Override
	public void sleep(String n) {
		System.out.println("Sleep on ground !");
	}
}

class Cat extends Animal{
	public void sleep(String n) {
		System.out.println("Sleep on bed !");
	}
	
	@Override
	int getQty() {
		return 2;
	}
	
	@Override
	public G getObj() {
		return new G();
	}
}

class D{}
class F extends D{}
class G extends F{}
