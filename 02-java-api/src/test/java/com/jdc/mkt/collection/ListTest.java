package com.jdc.mkt.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {

	void index(List<String>list) {
		System.out.println(list.get(4));
		System.out.println(list.size());
		list.remove(4);
		list.remove("e5");
		System.out.println(list.size());
		System.out.println(list.indexOf("e6"));
	}
	@Test
	void testListIndex() {
		List<String> array = new ArrayList<String>();
		addElement(array);
		index(array);
		List<String> link = new LinkedList<String>();
		addElement(link);
		index(link);
	}
	
	void addElement(List<String> list) {
		for(int i = 0 ; i < 10 ; i++)
			list.add("e"+i);
	}
	
	
}
