package com.learn.oops;

public class Bird {
	String name;
	int size;
	int strength;

	protected void attack() {

	}

	public String getName() {
		return name;
	}
}

class Bal extends Bird {

	@Override
	public void attack() {

	}
}



