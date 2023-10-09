package com.oops2interface;



public class FlyRunner {

	public static void main(String[] args) {

		Flyable[] fly = { new Bird(), new Aeroplane() };
		for (Flyable i : fly) {
			i.fly();
		}


	}

}
