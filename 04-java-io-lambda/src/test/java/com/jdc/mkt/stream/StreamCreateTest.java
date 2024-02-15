package com.jdc.mkt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StreamCreateTest {
	
	@Test
	void fromIterateAndGenerate() {
		 DoubleStream.generate(Math::random).limit(3).forEach(d -> System.out.println(d));
		 DoubleStream.iterate(2, a -> a+1).limit(5).forEach(e -> System.out.println(e));
		
	}
	
	@Test
	@Disabled
	void fromRange() {
		int sum = IntStream.range(1, 10).sum();
		System.out.println(sum);
		long sumclosed = LongStream.rangeClosed(1, 10).sum();
		System.out.println(sumclosed);
		
		Double d = DoubleStream.of(2.1,3.2,4.1).sum();
		System.out.println(d);
	}

	@Test
	@Disabled
	void fromArrOrCol() {
		int sumArr = Arrays.stream(new int[] {2,3,4}).sum();
		System.out.println(sumArr);
		
		Collection<Integer> col = new ArrayList<>(List.of(4,5,6));
		int sumCol = col.stream().mapToInt(i -> i).sum();
		System.out.println(sumCol);
	}
	
}
