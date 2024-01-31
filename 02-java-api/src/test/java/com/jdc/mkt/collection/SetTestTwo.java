package com.jdc.mkt.collection;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class SetTestTwo {

	@Test
	void testOverrideElement() {
		Set<Human> set = new HashSet<>();
		
		var human = new Human();
		human.setName("Andrew");;
		set.add(human);
		
		human.setName("William");
		set.add(human);
		
		for(Human h : set) {
			System.out.println(h.getName());
		}
	}
	class Human{
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	}
	
}
