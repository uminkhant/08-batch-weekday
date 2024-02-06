package com.jdc.mkt.utility;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class ArraysTest {

	String[]array = {"John","William","Andrew","Bob","Irza"};
	
	@Test
	@Order(1)
	void testSort() {
		Arrays.sort(array);
		show();
		Arrays.sort(array, Comparator.reverseOrder());
		show();
		Arrays.sort(array, 1, 5);
		show();
		Arrays.sort(array,1,5,Comparator.reverseOrder());
		show();
	}
	
	@Test
	@Order(2)
	void testSearch() {
		Arrays.sort(array);
		show();
		int result = Arrays.binarySearch(array, "Andrew");
		System.out.println(result);
		result = Arrays.binarySearch(array,1,5,"Andrew");
		System.out.println(result);
	}
	
	@Test
	@Order(3)
	void testfill() {
		Arrays.fill(array, "new");
		show();
		Arrays.fill(array, 3,4,"other");
		show();
	}
	
	@Test
	@Order(4)
	void testequal() {
		String[]array2 = {"John","William","Andrew","Bob","Irza"};
		var result = Arrays.equals(array, array2);
		System.out.println(result);
		
		//it can be create unlimitted array
		String[]array3 = Arrays.copyOf(array, array.length+1);
		System.out.println("last index :"+ array3[array3.length-1]);
		
	}
	
	private void show() {
		for(String s:array) {
			System.out.println(s);
		}
		System.out.println();
	}
}
