package com.oops2;

public class Customer {
	private String name;
	private Address home;
	private Address work;

	Customer(String name, Address home) {
		this.name = name;
		this.home = home;
	}

	void setWork(Address work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return String.format("name-%s,home-%s,work-%s", name, home, work);
	}
}
