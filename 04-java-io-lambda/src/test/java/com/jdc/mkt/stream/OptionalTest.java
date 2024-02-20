package com.jdc.mkt.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class OptionalTest {

	Optional<String> message(String m){
		return Optional.ofNullable(m);
	}
	
	@Test
	void testCollector() {
		var list = Stream.of("1,2,3,4","5,6,7,8","3,4")
					.map(s -> s.split(","))
					.flatMap(s -> Arrays.stream(s))
					.collect(Collectors.toList());
		System.out.println(list);
		
		var list1 = Stream.of("1,2,3,4","5,6,7,8","3,4")
				.map(s -> s.split(","))
				.flatMap(s -> Arrays.stream(s))
				.collect(Collectors.reducing((a,b) -> a+b) ).get();
	System.out.println(list1);
		
		
	}
	
	@Test
	@Disabled
	void testReduce() {
		int result = IntStream.range(1,10)
				.reduce((a,b) -> a+b).orElse(1);
		System.out.println(result);
		
		var list = new ArrayList<String>(List.of("r,4,2,g,5,h,7"));
		var sum = list.stream()
		.map(s -> s.split(","))
		.flatMap(s -> Arrays.stream(s))
		.mapToInt(i -> i.toCharArray()[0])
		.reduce((a,b) -> a+b).getAsInt();
		System.out.println(sum);
		
	}
	
	@Test
	@Disabled
	void testOptional() {
		
		assertEquals("Hello", message("Hello").get());
		
		message(null).ifPresentOrElse(
				s -> System.out.println("message :"+s),
				()-> System.out.println("No such element"));
		
		var sum = message("1,2,3,4")
		.stream()
		.map(s -> s.split(","))
		.flatMap(s -> Arrays.stream(s))
		.map(Integer::parseInt)
		.mapToInt(i ->i).sum();
		System.out.println(sum);
		
		String m = message("").or(() -> Optional.empty() ).get();
		assertTrue(m.isEmpty());
		
		assertEquals("No message", message(null).orElse("No message"));
		
		assertThrows(NoSuchElementException.class,
				() -> message(null).orElseThrow());
		
	}
}
