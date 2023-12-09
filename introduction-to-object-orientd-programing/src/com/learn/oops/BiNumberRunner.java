package com.learn.oops;

import java.math.BigDecimal;

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumber number = new BiNumber(2, 3);

		System.out.println(number.add());
		System.out.println(number.multiply());

		number.doubleValue();

		System.out.println(number.getNumber1());
		System.out.println(number.getNumber2());

		BigDecimal numbers1 = new BigDecimal("34.5567");

		BigDecimal numbers2 = new BigDecimal("34.5567");

		System.out.println(numbers1.add(numbers2));

	}

}
