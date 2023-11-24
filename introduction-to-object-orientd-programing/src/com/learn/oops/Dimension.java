package com.learn.oops;

public class Dimension {

	private int feet;
	private int inches;

	public Dimension(int inches) {
		if (inches < 0) {
			this.inches = -1;
			this.feet = -1;
		} else {
			this.inches = inches % 12;
			this.feet = inches / 12;
		}
	}

	public int getInches() {
		return inches;
	}

	public int getFeet() {
		return feet;
	}

}
