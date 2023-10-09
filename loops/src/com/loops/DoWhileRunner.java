package com.loops;

import java.util.Scanner;
public class DoWhileRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		do {
			if (number > 0) {
				System.out.println("cube is  " + number * number * number);
			}
			System.out.print("enter number:");
			number = scanner.nextInt();

		} while (number >= 0);
		System.out.println("tnk u loop stops");
	}

}
