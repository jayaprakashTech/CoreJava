package com.ExceptionHandling;

class Price {
	private int amount;
	private String currency;

	Price(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	void add(Price second) {
		if (!this.currency.equals(second.currency)) {
			throw new RuntimeException("currencies dont match " + this.currency + " not = to" + second.currency);
		}
		this.amount = this.amount + second.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}


public class ThrowingUncheckedExceptionRunner {

	public static void main(String[] args) {
		Price first = new Price(20, "USD");
		first.add(new Price(15, "EUR"));
		System.out.println(first);
	}

}
