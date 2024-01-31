package com.jdc.mkt.generic;

public class GenericDemoTwo {

	public static void main(String[] args) {
		
		var s = getMessage("Hello java");
		var i = getMessage(50);
		System.out.println(s+"\t"+i);
	}
	
	<T>void useAbsConverter(Container<T> c) {
		
	}
	
	<T> void show( T t) {
		System.out.println(t);
	}
	
	static <R> R getMessage(R r) {
		return r;
	}
}

interface ContainerInt<T>{
	T getData();
	void setData(T t);
}

abstract class Container<T> {
	T data;

	public T getData() {		
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}


