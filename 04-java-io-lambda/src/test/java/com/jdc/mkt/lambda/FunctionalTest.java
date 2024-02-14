package com.jdc.mkt.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FunctionalTest {

	static void useSingleWithoutReturn(String message) {
		System.out.println("Method reference ::"+message);
	}
	
	static void add(int a,int b) {
		System.out.println(a+b);
	}
	static boolean check(int a) {
		return a > 10 ;
	}
	
	@Test
	void testFunction() {
		Function<String, Integer> f1 = num -> Integer.parseInt(num);
		int res = f1.apply("30");
		System.out.println(res);
		
		Function<String, Integer> f2 = f1.compose(a -> Integer.toString(20));
		System.out.println(f2.apply("30"));
		
		Function<String, Integer> f3 = f1.andThen(a -> a.intValue());
		System.out.println(f3.apply("30"));
		
		ToIntFunction<String> f4 = str -> Integer.parseInt(str);
		int a = f4.applyAsInt("40");
		System.out.println(a);
		
	}
	@Test
	@Disabled
	void testPredicate() {
		Predicate<Integer> p1 = num -> num > 0;
		System.out.println(p1.test(-20));
		System.out.println(p1.negate().test(30));
		
		Predicate<Integer> p2 = num -> num < 10;
		System.out.println(p1.and(p2).test(5));
		System.out.println(p1.and(n -> n < 10).test(5));
		
		Predicate<Integer> p3 = num -> num > 10;
		System.out.println(p1.or(p3).test(5));
		System.out.println(p1.or(FunctionalTest::check).test(5));
	}
	@Test
	@Disabled
	void testConsumer() {
	
		//single input
		Consumer<String> c1 = message -> System.out.println(message);
		c1.accept("Hello single consumer");
		Consumer<String>c2 = FunctionalTest::useSingleWithoutReturn;
		c2.accept("Hello single consumer");
		
		//bi inputs
		BiConsumer<Integer, Integer> b1 = (a,b) -> System.out.println(a+b);
		b1.accept(5, 6);
		BiConsumer<Integer, Integer> b2 = FunctionalTest::add;
		b2.accept(2, 3);
		
		DoubleConsumer d1 = num -> System.out.println(num + 20.1);
		d1.accept(30);
	}
}
