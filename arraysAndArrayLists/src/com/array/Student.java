package com.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class Student {
	private String name;
	private int[] markList;

	Student(String name, int[] markList) {
		this.name = name;
		this.markList = markList;
	}

	int noOfMarks() {
		return markList.length;
	}

	int totalMarks() {
		int sum = 0;
		for (int i : markList) {
			sum = sum + i;
		}
		return sum;
	}

	BigDecimal average() {
		return new BigDecimal(totalMarks()).divide(new BigDecimal(noOfMarks()), 2, RoundingMode.UP);
	}

	int maximumMark() {
		int maximum = Integer.MIN_VALUE;
		for (int i : markList) {
			if (i > maximum) {
				maximum = i;
			}
		}
		return maximum;
	}

	int minimumMark() {
		int minimum = Integer.MAX_VALUE;
		for (int i : markList) {
			if (i < minimum) {
				minimum = i;
			}
		}
		return minimum;
	}
}