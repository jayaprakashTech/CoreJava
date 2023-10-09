package com.oops2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("india", 0.223354, "red");
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		fan.setSpeed((byte) 10);
		System.out.println(fan);
	}

}
