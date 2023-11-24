package com.learn.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(200);
//		int ducatiSpeed = ducati.getSpeed();
//		ducatiSpeed = ducatiSpeed + 100;
//		ducati.setSpeed(ducatiSpeed);
//		System.out.println(ducati.getSpeed());
//		ducati.increaseSpeed(50);
//		honda.increaseSpeed(200);

		ducati.deccreaseSpeed(300);
		honda.deccreaseSpeed(300);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

//		honda.setSpeed(50);
//		int hondaSpeed = honda.getSpeed();
//		hondaSpeed = hondaSpeed + 100;
//		honda.setSpeed(hondaSpeed);
//		System.out.println(honda.getSpeed());

//		System.out.println(ducati.getSpeed());

//		honda.setSpeed(50);
//		System.out.println(honda.getSpeed());

	}

}
