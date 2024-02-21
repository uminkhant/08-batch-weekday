package com.jdc.mkt;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class LegacyDateAndCalendarTest {
	
	@Test
	void formatExample() throws ParseException {
		var df1 = new SimpleDateFormat("yyyy-MM-dd G 'at' HH:mm:ss z");
		System.out.println(df1.parse("2001-07-04 AD at 12:08:56 PST"));
		
		var df2 = new SimpleDateFormat("yyyy-'W'ww-u");
		System.out.println(df2.parse("2024-W08-2"));
		
		var df3 = new SimpleDateFormat("E ,M-d,''yy");		
		System.out.println(df3.parse("Tue ,02-20,'24"));
	}
	
	@Test
	@Disabled
	void dateFormatTest() throws ParseException {
		var df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
		var c1 = Calendar.getInstance();
		c1.setLenient(true);
		c1.setTime(df1.parse("2020-01-21 25:20:20 900"));
		System.out.println(c1.getTime());
		
		var df2 = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		System.out.println(df2.parse("2020-01-21 25:20:20"));
	}
	
	@Test
	@Disabled
	void dateFormatWithCalendar() throws ParseException {
		var df = new SimpleDateFormat("dd:MM:yyyy");
		var date = df.parse("02:02:2022");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(c.getTime());
	}
	
	@Test
	@Disabled
	void addDateTest() {
		Calendar c = Calendar.getInstance();
		c.setLenient(false);
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.getTime());
		c.roll(Calendar.DAY_OF_WEEK, 10);
		System.out.println(c.getTime());
	}
	
	@Test
	@Disabled
	void setDateTest() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.MONTH, 03);
		c.set(5, 2);
		System.out.println(c.getTime());
		
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_YEAR,39);
		c1.setLenient(false);
		System.out.println(c1.getTime());
	}
	@Test 
	@Disabled
	void dateTest() {
		Calendar c = Calendar.getInstance(Locale.JAPAN);
		System.out.println(c.getTime());
		System.out.println(c.getTimeZone().getID());
		
		Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("America/Mexico_City"));	
		System.out.println(c1.getTime());
	}

	@Test
	@Disabled
	void createDate() throws ParseException {
		Date d1 = new Date();
		
		System.out.println(d1);
		
		Date d2 = new Date(9234239);
		System.out.println(d2);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d3 = df.parse("1980-05-11");
		System.out.println(d3);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());
	}
}
