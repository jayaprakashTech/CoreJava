package com.oop2.inheritance;

public class ReceipeRunner {

	public static void main(String[] args) {
		Receipe receipe = new Receipe();
		receipe.execute();

		ReceipeWithMicrowave receipe2 = new ReceipeWithMicrowave();
		receipe2.execute();

	}

}
