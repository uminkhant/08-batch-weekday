package com.jdc.mkt.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StreamTerminalTest {
	
	@Test
	void optionalTest() {		
				 Stream.of(List.of(2,1,3,4,2),List.of(3,5,6,7))
				.flatMap(l -> l.stream())
				.filter(i -> i % 10 == 0)
				.findAny()
				.ifPresent(i -> System.out.println(i));
		
//		Stream.of(List.of(2,1,3,4,2),List.of(3,5,6,7))
//				.flatMap(l -> l.stream())
//				.filter(i -> i % 10 == 0)
//				.findAny()			
//				.ifPresentOrElse(
//						a -> System.out.println(a),
//						() -> System.out.println("no elemet")
//						);
	}

	@Test
	@Disabled
	void result() {
		var result = Stream.of(
				new Human("Andrew", 23),
				new Human("William", 30), 
				new Human("Arnel", 33))			
				.sequential()
				.findFirst()
				//.findAny()
				.orElse(new Human("other", 40))
				.getName();
		System.out.println(result);
		
		var arr = Stream.of(List.of(2,1,3,4,2),List.of(3,5,6,7))
		.flatMap(l -> l.stream())
		.toArray();
		System.out.println(arr);
	}

	@Test
	@Disabled
	void checking() {
		var result = Stream.of(new Human("Andrew", 23), new Human("William", 30), new Human("Arnel", 33))
				// .allMatch(h -> h.getName().startsWith("A")); // false
				// .noneMatch(h -> h.getName().startsWith("A")); // false
				.anyMatch(h -> h.getName().startsWith("A"));
		System.out.println(result);

	}

	@Test
	@Disabled
	void forEachOrderTest() {
		Stream.of(new Human("Andrew", 23), new Human("William", 30), new Human("Arnel", 33)).sorted()
				.forEachOrdered(h -> System.out.println(h.getName()));
	}

}
