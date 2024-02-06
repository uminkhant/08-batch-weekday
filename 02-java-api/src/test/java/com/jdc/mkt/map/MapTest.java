package com.jdc.mkt.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class MapTest {

	static Map<Integer, String> hash = new HashMap<>();
	static Map<Integer, String> tree = new TreeMap<>();
	static Map<Integer, String> link = new LinkedHashMap<>();
	
	@Test
	@Order(1)
	void test() {
		
		addElement(tree);
		show(tree);
	}
	
	@Test
	@Order(2)
	void testMethod() {
		System.out.println();
		System.out.println("Test Method in map ");
		System.out.println(tree.containsKey(4));
		System.out.println(tree.containsValue("One"));
		System.out.println(tree.getOrDefault(8, "Default Value"));
		System.out.println(tree.containsKey(8));
		System.out.println(tree.replace(4, "other"));
		System.out.println(tree.get(4));
		System.out.println(tree.putIfAbsent(8, "add new"));
		System.out.println(tree.get(8));
		
		System.out.println();
	}
	
	private void addElement(Map<Integer, String> map) {
		/*for(int i = 0 ; i < 5 ; i++) {
			map.put(i+1, "Value :"+i);
		}*/
		map.put(4, "Four");
		map.put(7, "Seven");
		map.put(4, "Five");
		map.put(1, "One");
		map.put(2, "Two");
	}
	
	private void show(Map<Integer, String> map) {
		/*for(int i = 0 ; i < map.size() ; i++) {
			System.out.println(map.get(i+1));
		}*/
		
		for(Entry<Integer, String> e:map.entrySet()) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}
	
	
}
