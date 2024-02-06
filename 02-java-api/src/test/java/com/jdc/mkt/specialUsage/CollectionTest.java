package com.jdc.mkt.specialUsage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.compare.Data;

public class CollectionTest {

	List<Data> list = new ArrayList<>();

	//@Test
	void testUnmodifiedAndSync() {
		var unlist = Collections.unmodifiableList(list);
		list.add(new Data("Snowei", 1));
		//unlist.add(new Data("Mike", 5));
		System.out.println(list.size() +"\t"+ unlist.size());
		
		var syList = Collections.synchronizedList(list);
		System.out.println(syList);
	}
	
	@Test
	void testOther() {
		Collections.swap(list, 0, 4);
		System.out.println(list);
		var res =  Collections.max(list);
		System.out.println(res);
	}
	
	@BeforeEach
	void addData() {
		list.add(new Data("John", 3));
		list.add(new Data("James", 2));
		list.add(new Data("Snowei", 1));
		list.add(new Data("James", 4));
		list.add(new Data("Andrew", 4));
		list.add(new Data("mike", 5));
	}
}
