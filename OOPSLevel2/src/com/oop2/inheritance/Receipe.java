package com.oop2.inheritance;

public class Receipe extends AbstractReceipe {
	@Override
	void prepare() {
		System.out.println("get ready");
	}

	@Override
	void doReceipe() {
		System.out.println("cooking");
	}

	@Override
	void cleanUp() {
		System.out.println("cleaned");
	}
}
