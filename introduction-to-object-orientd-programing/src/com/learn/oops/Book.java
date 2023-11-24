package com.learn.oops;

public class Book {

	private int noOfCopies;

	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}

	}

	public void increaseNoOfCopies(int nos) {
		setNoOfCopies(this.noOfCopies + nos);
	}

	public void decreaseNoOfCopies(int nos) {
		setNoOfCopies(this.noOfCopies - nos);
	}

	public void reading() {

		System.out.println("Tapan please have a look on these books...");

	}

}
