package com.primitiveDataTypes;

public class BiNumber {
	private int a;
	private int b;

	public BiNumber(int i, int j) {
		this.a = i;
		this.b = j;
	}

	int add() {
		return this.a + this.b;
	}

	int multiply() {
		return this.a * this.b;
	}

	void doubleValue() {
		this.a += this.a;
		this.b += this.b;
	}

	public int getA() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}

}
