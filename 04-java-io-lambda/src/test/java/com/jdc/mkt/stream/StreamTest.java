package com.jdc.mkt.stream;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamTest {
	
	List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9));
	
	private int beforSum(List<Integer> list) {
		int count = 0 ;
		for(int i :list) {
			count += i;
		}
		return count;
	}
	
	private int afterSum(List<Integer> list) {
		return list.stream().mapToInt(i -> i).sum();
	}

	@Test
	void testStream() {
		System.out.println(beforSum(list));
		System.out.println(afterSum(list));
	}
}
