package com.jdc.mkt.compare;

public record Data (String value,Integer key) implements Comparable<Data>{

	@Override
	public int compareTo(Data o) {		
		//return o.key.compareTo(key);
		 return value.compareTo(o.value);	
	}
	
}
