package com.bw.day10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day10 {

	@Test
	void test01() {
		String dateByMonth = DateUtil.DateByMonth("2019-10-10");
		System.out.println(dateByMonth);
	}
	
	@Test
	void test02() {
		String dateByMonth = DateUtil.DateByMonthlast("2019-10-10");
		System.out.println(dateByMonth);
	}
	
	@Test
	void test03() {
		long dateByMonth = DateUtil.getage("2019-10-10");
		System.out.println(dateByMonth);
	}
	
	@Test
	void test04() {
		long dateByMonth = DateUtil.getlastage("2019-10-10");
		System.out.println(dateByMonth);
	}

}
