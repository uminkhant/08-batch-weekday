package com.jdc.mkt;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DateTimeFormatterTest {
	
	@Test
	void customFormatTest() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a O");
		String str = df.format(ZonedDateTime.now());
		System.out.println(str);
	}
	
	@Test
	@Disabled
	void localizeFormatTest() {
		
		Format fmt = DateTimeFormatter
				 .ofLocalizedDateTime(FormatStyle.FULL)
				 .toFormat();		
		System.out.println(fmt.format(ZonedDateTime.now()));
		
		String str2 = DateTimeFormatter
				 .ofLocalizedDateTime(FormatStyle.FULL)
				 .format(ZonedDateTime.now());
		System.out.println(str2);

	}

	@Test
	@Disabled
	void isoFormatTest() {
		String f1 = DateTimeFormatter.ISO_ZONED_DATE_TIME.format(OffsetDateTime.now());
		System.out.println(f1);
		
		var date = DateTimeFormatter.ISO_DATE_TIME.parse(f1);
		System.out.println(date.get(ChronoField.YEAR)+"\t"
		+date.get(ChronoField.MONTH_OF_YEAR)+"\t"
		+date.get(ChronoField.DAY_OF_MONTH));
		
	}
}
