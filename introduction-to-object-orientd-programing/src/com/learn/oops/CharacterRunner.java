package com.learn.oops;

public class CharacterRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('A');
		System.out.println(myChar.isVowel());

		System.out.println(myChar.isConsonent());

		System.out.println(myChar.isDigit());

		// System.out.println(myChar.isAlphabet());

		MyChar.printLowerCaseAlphabet();

		MyChar.printUpperCaseAlphabet();


	}

}
