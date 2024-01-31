package com.jdc.mkt.generic;

@SuppressWarnings("unused")

public class GenericTypeConverter {

	public static void main(String[] args) {
		NumberConverter<Double> d = new NumberConverter<>();
		Double res = d.convertToNumber("50");
		var ttl = res + 3;
	}
}

@SuppressWarnings("unused")
class NumberConverter<R> implements ConvertToNumber<R> {

	private R returnType;

	@Override
	public R convertToNumber(String value) {

//		if (returnType instanceof Double d) {
//			return Double.parseDouble(value);
//		} else if (returnType instanceof Integer) {
//			return Integer.parseInt(value);
//		} else if (returnType instanceof Long) {
//			return Long.parseLong(value);
//		}
		return null;
	}

}

interface ConvertToNumber<R> {

	R convertToNumber(String value);
}

interface ConvertToString<T> {
	String convertToString(T t);
}
