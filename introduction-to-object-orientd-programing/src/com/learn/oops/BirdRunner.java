package com.learn.oops;

public class BirdRunner {

	public static void main(String[] args) {

		Bird chuck = new Chuck();
		Bird hal = new Hal();
		Bird bal = new Bal();

		chuck.attack();
		hal.attack();
		bal.attack();
	}

}
