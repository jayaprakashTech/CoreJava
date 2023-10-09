package com.array;

public class StringRunner {

	public static void main(String[] args) {
		String[] weekDays = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		String mostLetter = "";
		for (String i : weekDays) {
			if (mostLetter.length() < i.length()) {
				mostLetter = i;
			}
		}
		System.out.println("most letter : " + mostLetter);

		for (int i = weekDays.length - 1; i >= 0; i--) {
			System.out.println(weekDays[i]);
		}
	}

}
