package com.jdc.mkt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AccessDateTimeTest {
	
	@Test
	@Disabled
	@SuppressWarnings("unused")
	void adjustTest() {
		var ldt = LocalDateTime.now();
		
		//minus with temporal amount and temporal unit
		var minus = ldt.minus(Period.ofMonths(2));
		var minus2 = ldt.minus(20, ChronoUnit.MONTHS);
		
		System.out.println("minus with temporal amout : "+minus);
		System.out.println("minus with temporal unit :"+minus2);
		
		//minus with fluent method
		System.out.println("minus with temporal amout :"+ldt.minusMonths(2));
		
		//plus with temporal unit and fluent method
		var plus = ldt.plus(20, ChronoUnit.HOURS);
		System.out.println("plus with fluent method :"+ldt.plusHours(20));
		System.out.println("plus with temporal unit :"+plus);
		
		//with temporal adjustor
		var adjustor1  = ldt.with(LocalDate.of(2011, 01, 10));
		System.out.println("with temporal adjustor :"+adjustor1);
		
		//with temporal field
		var field = ldt.with(ChronoField.DAY_OF_MONTH, 10);
		System.out.println("with temporal field :"+field);
		
		//with fluent method
		var fluent = ldt.withYear(2010);
		System.out.println("with fluent method :"+fluent);
		
		//with temporal adustors utility class
		var lastDay  = TemporalAdjusters.lastDayOfMonth();
		var dayOfWeek = TemporalAdjusters.next(DayOfWeek.MONDAY);		
		System.out.println("with temporal adjustors :"+ldt.with(dayOfWeek));
		
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
