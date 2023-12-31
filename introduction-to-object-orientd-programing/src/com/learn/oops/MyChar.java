package com.learn.oops;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;

	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;
		return false;
	}

	public boolean isConsonent() {
		if (isAlphabet() && !isVowel())
			return true;
		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57)
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 97 || ch <= 122)
			return true;
		if (ch >= 65 || ch <= 90)
			return true;
		return false;
	}

	public static void printLowerCaseAlphabet() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}

	}

	public static void printUpperCaseAlphabet() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}

	}

}
