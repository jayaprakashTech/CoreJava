package com.primitiveDataTypes;

public class MyChar {
	private char a;

	MyChar(char ch) {
		this.a = ch;
	}

	boolean isVowel() {
		if (this.a == 'a' || this.a == 'e' || this.a == 'i' || this.a == 'o' || this.a == 'u') {
			return true;
		} else {
			return false;
		}
	}

	boolean isDigit() {
		if (48 <= this.a && 57 >= this.a) {
			return true;
		} else {
			return false;
		}
	}

	boolean isAlphabet() {
		if (65 <= this.a && 90 >= this.a) {
			return true;
		} else {
			return false;
		}
	}

	boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		} else {
			return false;
		}
	}

	static void printLowerCase() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	static void printUpperCase() {
		for (char ch = 65; ch <= 90; ch++) {
			System.out.println(ch);
		}
	}
}
