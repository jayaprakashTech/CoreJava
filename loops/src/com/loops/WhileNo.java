package com.loops;

public class WhileNo {
	private int limit;

	WhileNo(int limit) {
		this.limit = limit;
	}

	void printSquares() {
		int i = 1;
		while (i * i < limit) {
			System.out.print(i * i + "  ");
			i++;
		}
		System.out.println();
	}

	void printCubes() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.print(i * i * i + "  ");
			i++;
		}
		System.out.println();
	}
}
