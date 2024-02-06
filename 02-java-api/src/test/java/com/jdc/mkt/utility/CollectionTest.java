package com.jdc.mkt.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.compare.Data;

@TestMethodOrder(OrderAnnotation.class)
public class CollectionTest {

	List<Data> list = new ArrayList<>();
	
	@BeforeEach
	void addData() {
		list.add(new Data("John", 3));
		list.add(new Data("James", 2));
		list.add(new Data("Snowei", 1));
		list.add(new Data("James", 4));
		list.add(new Data("Andrew", 4));
		list.add(new Data("Mike", 5));
	}
	
	@Test
	@Order(3)
	void testOther() {
		Collections.shuffle(list);
		System.out.println(list);
		var res  = Collections.frequency(list, new Data("James", 2));
		System.out.println(res);
		var list2 = List.of(new Data("test1",2),new Data("test2", 3),new Data("James", 2));
		var isTrue = Collections.disjoint(list, list2);
		System.out.println(isTrue);
		
	}
	
	@ParameterizedTest
	@CsvSource(value = {"James:7","Will,4"}, delimiter = ':')
	@Order(2)
	void testSearch(String value,int key) {
		Collections.sort(list);
		System.out.println(list);
		var result = Collections.binarySearch(list, new Data(value,key));
		System.out.println(result);
	}
	
	@Test
	@Order(1)
	void testSort() {
		Collections.sort(list);
		System.out.println(list);
	}
}
