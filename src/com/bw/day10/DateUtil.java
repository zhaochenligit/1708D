package com.bw.day10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateUtil {

	public static String DateByMonth(String date) {
		LocalDate with = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")).with(TemporalAdjusters.firstDayOfMonth());
		return with+" "+DateTimeFormatter.ofPattern("yyyy-MM-dd");
	}
	
	public static String DateByMonthlast(String date) {
		LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")).with(TemporalAdjusters.lastDayOfMonth());
		return localDate+" "+DateTimeFormatter.ofPattern("yyyy-MM-dd");
	}
	
	public static long getage(String date) {
		LocalDate now = LocalDate.now();
		LocalDate from = LocalDate.from(now);
		System.out.println("想差天数："+ChronoUnit.DAYS.between(from, now));
		System.out.println("相差天数："+Math.abs(ChronoUnit.DAYS.between(from, now)));
		long between = ChronoUnit.DAYS.between(from, now);
		return between;
	}
	
	public static long getlastage(String date) {
		LocalDate now = LocalDate.now();
		LocalDate from = LocalDate.from(now);
		long between = ChronoUnit.YEARS.between(from, now);
		return between;
	}
}
