package com.jdc.mkt.compare;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

public class TreeMapTest {

	@Test
	void test() {
		Map<Data, String> map = new TreeMap<>();
		// addStringValue(map);
		addData(map);
		show(map);
	}
	
	
	void addData( Map<Data, String> map) {
	
		map.put(new Data("Five",5),"One");
		map.put(new Data("Six",6),"Two");
		map.put(new Data("one",1),"Three");
		map.put(new Data("Four",4),"Four");
	}

	void show(Map<Data, String> map) {
		for(Entry<Data, String> e:map.entrySet()) {
			System.out.println(
						e.getKey().key()+
					"\t"+e.getKey().value()+
					"\t"+e.getValue());
		}
	}
	

}





