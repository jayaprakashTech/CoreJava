package com.oop2.inheritance;

public class Person {
	private String name;
	private String phn;
	private String email;

	Person(String name, String phn) {
		this.name = name;
		this.phn = phn;
	}

	void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + " " + phn + " " + email;
	}
}
