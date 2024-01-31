package com.jdc.mkt.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

public class SetTest {

	@Test
	void test() {
		Set<Integer> link = changeObj("link");

		addValue(link);
		System.out.println(link.size());
		System.out.println(link.isEmpty());
		System.out.println(link.contains(3));
		System.out.println();
		link.remove(2);
		link.remove(1);
		link.add(7);
		link.add(9);
		link.add(7);
		link.add(9);
		show(link);
		System.out.println();
		Set<Integer> link2 = changeObj("link");
		addValue(link2);
		link.addAll(link2);
		show(link);

	}

	void show(Set<Integer> set) {
		for (Integer i : set) {
			System.out.println(i);
		}
	}

	private Set<Integer> changeObj(String obj) {
		switch (obj) {
		case "hash":
			return new HashSet<Integer>();
		case "tree":
			return new TreeSet<Integer>();
		case "link":
			return new LinkedHashSet<Integer>();

		default:
			return null;

		}
	}

	private void addValue(Set<Integer> set) {
		set.add(2);
		set.add(1);
		set.add(6);
		set.add(3);
	}

}
