package com.oop2.inheritance;

public class Employee extends Person {
	private String title;

	Employee(String name, String phn, String title) {
		super(name, phn);
		this.title = title;
	}
	@Override
	public String toString() {
		return super.toString() + String.format("title-%s", title);
	}
}
