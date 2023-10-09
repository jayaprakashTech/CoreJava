package com.ExceptionHandling;

class Price1 {
	private int amount;
	private String currency;

	Price1(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	void add(Price1 second) throws Exception {
		if (!this.currency.equals(second.currency)) {
			throw new Exception("currencies dont match " + this.currency + " not = to" + second.currency);
		}
		this.amount = this.amount + second.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

public class ThrowingCheckedExceptionRunner {

	public static void main(String[] args) throws Exception {
		Price1 first = new Price1(20, "USD");
		first.add(new Price1(15, "EUR"));
		System.out.println(first);

	}

}
