package com.learn.oops;

public class SquareRunner {

	public static void main(String[] args) {
		Square sq = new Square(8);
//		sq.calculateArea(4);
		System.out.println(sq.calculateArea());
		System.out.println(sq.calculatePerimeter());
	}

}
