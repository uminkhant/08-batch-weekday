package com.jdc.mkt;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AccessDateTimeTest {
	
	@Test
	void adjustTest() {
		var ldt = LocalDateTime.now();
		var minus = ldt.minus(Period.ofMonths(2));
		
		System.out.println(minus);
		System.out.println(ldt.minusMonths(2));
		
		var plus = ldt.plus(20, ChronoUnit.HOURS);
		System.out.println(ldt.plusHours(20));
		System.out.println(plus);
	}

	@Test
	@Disabled
	void getDateTime() {
		var ldt = LocalDateTime.now();
		var zone = ZonedDateTime.now();
		System.out.println(ldt.get(ChronoField.YEAR));
		System.out.println(ldt.getYear());
		
		System.out.println(ldt.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(ldt.getMonthValue());
		
		System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
		System.out.println(ldt.getDayOfMonth());
		
		System.out.println(zone.getZone());
		
	}
}
