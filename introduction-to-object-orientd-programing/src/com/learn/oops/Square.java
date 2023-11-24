package com.learn.oops;

public class Square {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int calculateArea() {
		int area;

		if (side <= 0) {
			return -1;
		} else {

			area = side * side;
		}
		return area;
	}

	public int calculatePerimeter() {
		if (side <= 0) {
			return -1;
		}

		return 4 * side;
	}

}
