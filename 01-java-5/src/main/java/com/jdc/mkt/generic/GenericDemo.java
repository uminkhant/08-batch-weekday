package com.jdc.mkt.generic;

public class GenericDemo {

	public static void main(String[] args) {
		Data<String> d = new Data<>();
		d.setValue("ss");
		// int ss = (Integer) d.getValue();
		String s = d.getValue();

		System.out.println(s);
	}
}

	 class Data<T> {
		private T value;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

	}

