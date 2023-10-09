package com.ExceptionHandling;

import java.util.Scanner;

public class BasicsExceptionRunner {
	static void method1() {

		try {
			String str = null;
			str.length();

		} catch (NullPointerException ex) {
			System.out.println("null exception matched");
		}
		catch (Exception ex) {
			System.out.println("exception matched");
			ex.printStackTrace();
		}
	}

	static void method2() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] n = { 1, 2 };
			int numbers = n[2];
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("array exception matched");
		} finally {
			if (scanner != null) {
			scanner.close();
			}
			System.out.println("finally executed");
		}
	}
	public static void main(String[] args) {
		// method1();
		method2();
	}

}
