package com.jdc.mkt.compare;

import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class TreeSetTest {

	@Test
	void test() {
		Set<Data> tree = new TreeSet<>();
		// addStringValue(tree);
		addData(tree);
		show(tree);
	}

	void addData(Set<Data> tree) {
		tree.add(new Data("Five",5));
		tree.add(new Data("Six",6));
		tree.add(new Data("one",1));
		tree.add(new Data("Four",4));
	}

	void show(Set<?> tree) {
		var itr = tree.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	void addStringValue(Set<String> tree) {
		tree.add("Five");
		tree.add("Six");
		tree.add("one");
		tree.add("Four");
	}
}
