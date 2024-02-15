package com.jdc.mkt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StreamIntermediateTest {
	
	@Test
	void testThree() {
		Stream.of(
				List.of(1,2),
				List.of(1,2,3,4)
				)
		.flatMap(l -> l.stream())
		.mapToInt(i -> i)
		.peek(i -> System.out.println("Peek: "+(++i)))
		.forEach(a -> System.out.println(a));
		
	}
	
	@Test
	@Disabled
	void testTwo() {
		List<String> list = new ArrayList<String>(List.of("John","William","Andrew","James","Sopheia","Andrew"));
		list.stream()
		.map(str -> str.toUpperCase())
		.distinct()
		.sorted()
		.mapToInt(s -> s.length())
		.mapToDouble(i -> i+3.22)
		.forEach(s -> System.out.println(s));
	}

	@Test
	@Disabled
	void testOne() {
		Arrays 
		.stream(new int[] {5,6,7,8,8,5,101,2,5,3,4})
		.skip(3) //skip start from 5,6,7
		.distinct() //get only one element from duplicate elements ( 8,8,5,5,5 )
		.filter(i -> i%2 == 0) // get elements which is even number
		.sorted() // sorted asc
		.limit(2) // get two element only
		.forEach(i -> System.out.println(i));
		
	}
}
