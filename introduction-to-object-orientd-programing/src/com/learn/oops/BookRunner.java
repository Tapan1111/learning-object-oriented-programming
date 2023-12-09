package com.learn.oops;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effictiveJava = new Book(22);
		Book cleanCode = new Book(87);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effictiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.reading();
		effictiveJava.reading();
		cleanCode.reading();

		artOfComputerProgramming.setNoOfCopies(100);
		effictiveJava.setNoOfCopies(200);
		cleanCode.setNoOfCopies(300);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effictiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

//		artOfComputerProgramming.increaseNoOfCopies(200);
		artOfComputerProgramming.decreaseNoOfCopies(200);
		effictiveJava.decreaseNoOfCopies(3000);
		cleanCode.decreaseNoOfCopies(400);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effictiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

	}

}
