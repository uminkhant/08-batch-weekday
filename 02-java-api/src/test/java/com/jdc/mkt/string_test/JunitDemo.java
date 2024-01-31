package com.jdc.mkt.string_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitDemo {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
	}
	@AfterEach
	void afterEach() {
		System.out.println("After Each");
	}
	@Test
	void testOne() {
		System.out.println("Test One");
	}
	@Test
	void testTwo() {
		System.out.println("Test Two");
	}
	@Test
	void testThree() {
		System.out.println("Test Three");
	}
}
