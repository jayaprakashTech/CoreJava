package com.primitiveDataTypes;

public class CharRunner {

	public static void main(String[] args) {
		MyChar char1 = new MyChar('B');
		System.out.println(char1.isVowel());
		System.out.println(char1.isDigit());
		System.out.println(char1.isAlphabet());
		System.out.println(char1.isConsonant());
		MyChar.printLowerCase();
		MyChar.printUpperCase();
	}

}
