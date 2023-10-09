package com.loops;

public class MyNumber {
	private int n;

	MyNumber(int number) {
		this.n = number;
	}

	boolean isPrime() {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	void numberTriangle() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}
}
