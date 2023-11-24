package com.learn.oops;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;

	}

	public double distanceTo(int a, int b) {
		int diffX = a - this.x;
		int diffY = b - this.y;
		return Math.sqrt(diffX * diffX + diffY * diffY);
	}
}
