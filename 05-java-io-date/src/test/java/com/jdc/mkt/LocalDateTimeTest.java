package com.jdc.mkt;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LocalDateTimeTest {
	
	@Test
	void toMechineVsHuman() {
		var ldt = LocalDateTime.now();
		System.out.println("Instant time :"+ldt.toInstant(ZoneOffset.of("+06:30")));
		
		var instant1 = ZonedDateTime.of(ldt, ZoneId.of("GMT")).toInstant();
		System.out.println("Instant time :" +instant1);
		var zone = instant1.atZone(ZoneId.of("GMT"));
		System.out.println("Human time : "+zone.toLocalDateTime());
		
		var instant2 = ZonedDateTime.of(ldt, ZoneOffset.of("+06:30")).toInstant();
		System.out.println("Instant time :"+instant2);
		var offset = instant2.atOffset(ZoneOffset.of("+06:30"));
		System.out.println("Human time :"+offset.toLocalDateTime());
	}

	@Test
	@Disabled
	void createDateTest() {
		System.out.println(LocalDateTime.now());
		System.out.println(Instant.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.of(2024, 02, 29));
		System.out.println(LocalDateTime.of(
				LocalDate.of(22, 2, 3),
				LocalTime.of(3, 10)));
	}
}
