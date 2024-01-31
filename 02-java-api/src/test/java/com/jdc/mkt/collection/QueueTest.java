package com.jdc.mkt.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.junit.jupiter.api.Test;

public class QueueTest {

	@Test
	void test() {
		Queue<String> q = new ArrayBlockingQueue<String>(3);
		Queue<String> q1 = new PriorityQueue<String>(3);
		q.offer("James");
		q.add("John");
		q.add("William");
		q.offer("Susan");
		System.out.println("Size :"+q.size());
		
		var nam = q.remove();
		System.out.println("Name :"+nam);
		
		for(String s:q) {
			System.out.println(s);
		}
		
		q.poll();
		q.poll();
		q.poll();
		System.out.println("Size :"+q.size());
		
		
		var element = q.peek();
		System.out.println(element);
		//q.peek();
		
	}
}
