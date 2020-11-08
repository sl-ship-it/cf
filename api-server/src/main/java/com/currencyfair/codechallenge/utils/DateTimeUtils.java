package com.currencyfair.codechallenge.utils;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

	private DateTimeUtils() {
	}

	private static final DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd-MMM-yy HH:mm:ss")
			.withZone(ZoneId.systemDefault());

	public static OffsetDateTime convertToOffsetDate(String dateTimeStr) {
		return ZonedDateTime.parse(dateTimeStr, fm).toOffsetDateTime();
	}

	public static String convertToString(OffsetDateTime dateTime) {
		return fm.format(dateTime);
	}
}
