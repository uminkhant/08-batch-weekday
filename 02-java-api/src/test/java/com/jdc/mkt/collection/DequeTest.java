package com.jdc.mkt.collection;

import java.util.ArrayDeque;

import org.junit.jupiter.api.Test;

public class DequeTest {

	@Test
	void test() {
		ArrayDeque<Integer> d = new ArrayDeque<Integer>();
		d.add(3);
		d.addFirst(5);
		d.addLast(4);
		d.addFirst(7);
		d.add(9);
		for(int i:d) {
			System.out.println(i);
		}
	}
}
