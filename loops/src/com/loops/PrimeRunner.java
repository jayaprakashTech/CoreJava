package com.loops;

public class PrimeRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(6);
		System.out.println("isPrime" + number.isPrime());
		System.out.println("sum upto N" + number.sumUptoN());
		System.out.println("sumOfDivisors:" + number.sumOfDivisors());
		number.numberTriangle();
	}

}
