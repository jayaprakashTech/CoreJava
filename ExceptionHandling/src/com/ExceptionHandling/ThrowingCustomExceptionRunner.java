package com.ExceptionHandling;

class CustomCheckedException extends Exception {
	CustomCheckedException(String msg) {
		super(msg);
	}
}

class CustomUncheckedException extends RuntimeException {
	CustomUncheckedException(String msg) {
		super(msg);
	}
}

class Price2 {
	private int amount;
	private String currency;

	Price2(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	void add(Price2 second) throws CustomCheckedException {
		if (!this.currency.equals(second.currency)) {
			throw new CustomCheckedException("currencies dont match " + this.currency + " not = to" + second.currency);
		}
		this.amount = this.amount + second.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

public class ThrowingCustomExceptionRunner {

	public static void main(String[] args) throws CustomCheckedException {
		Price2 first = new Price2(20, "USD");
		first.add(new Price2(15, "EUR"));
		System.out.println(first);

	}

}
