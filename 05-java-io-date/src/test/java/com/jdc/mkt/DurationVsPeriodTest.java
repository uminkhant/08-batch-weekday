package com.jdc.mkt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DurationVsPeriodTest {
	
	@Test
	void DurationTest() {
		var d1 = Duration.between( LocalTime.now(),LocalTime.of(16, 00));
		System.out.println(d1.toHours()+"\t"+d1.toMinutes());
		
		var d2 = Duration.of(1, ChronoUnit.DAYS);
		System.out.println(d2.toHours());
		
		var d3 = Duration.from(Duration.ofDays(3));
		System.out.println(d3);
		System.out.println(d3.toHours()+"\t"+d3.toMillis());
		
		var d4 = Duration.parse("PT48H30M30S");
		System.out.println(d4);
		System.out.println(d4.toMinutes()+"\t"+((48*60)+30));
	}

	@Test
	@Disabled
	void PeriodTest() {
		var p1 = Period.between(LocalDate.now(), LocalDate.of(2024, 04, 13));
		System.out.println(p1);
		System.out.println(p1.getYears()+"\t"+p1.getMonths()+"\t"+p1.getDays());
		
		var p2 = Period.ofDays(10);
		System.out.println(p2);
		System.out.println(p2.addTo(LocalDate.of(2022, 01, 10)));
		
		var p3 = Period.of(2011,10, 02);
		System.out.println(p3);
		
		var p4 = Period.parse("P2022Y03M20D");
		System.out.println(p4.getYears()+"\t"+p4.getMonths()+"\t"+p4.getDays());
		
	}
}
