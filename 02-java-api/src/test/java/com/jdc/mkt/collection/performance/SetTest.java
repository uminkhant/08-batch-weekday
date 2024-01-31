package com.jdc.mkt.collection.performance;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class SetTest {

	static HashSet<Integer> hash = new HashSet<Integer>();
	static LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
	static TreeSet<Integer> tree = new TreeSet<Integer>();
	
	
	@Test
	@Order(1)
	void testAdd() {
		System.out.println("Add Elements");
		var hResult = getTakeTimes(hash,false);
		var tResult = getTakeTimes(tree,false);
		var lResult = getTakeTimes(link,false);
		System.out.println("Hash :"+ hResult);
		System.out.println("Tree :"+tResult);
		System.out.println("Link :"+lResult);
	}
	
	@Test
	@Order(2)
	void testRemove() {
		System.out.println("Remove Elements");
		var hResult = getTakeTimes(hash,true);
		var tResult = getTakeTimes(tree,true);
		var lResult = getTakeTimes(link,true);
		System.out.println("Hash :"+ hResult);
		System.out.println("Tree :"+tResult);
		System.out.println("Link :"+lResult);
	}

	private long getTakeTimes(Set<Integer> set, boolean isRemove) {
		var start = LocalTime.now();
		if(isRemove == false) {
			addElements(set);
		}else {
			removeElements(set);
		}
		var end = LocalTime.now();
		return Duration.between(start, end).toNanos();

	}

	void removeElements(Set<Integer> set) {

		for (int i = 0; i < set.size(); i++)
			set.remove(i);
	}

	void addElements(Set<Integer> set) {
		for (int i = 0; i < 1000000; i++)
			set.add(i + 1);
	}
}
