package com.oop2.inheritance;

public class ReceipeWithMicrowave extends AbstractReceipe {
	@Override
	void prepare() {
		System.out.println("get ready with microwave");
	}

	@Override
	void doReceipe() {
		System.out.println("cooking and baking in microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("clean the microwave");
	}

}
