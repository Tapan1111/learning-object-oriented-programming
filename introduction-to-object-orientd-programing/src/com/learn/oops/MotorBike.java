package com.learn.oops;

public class MotorBike {

	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {

		setSpeed(this.speed + howMuch);
	}

	public void deccreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	public void start() {

		System.out.println("Bike Started");
	}

}
