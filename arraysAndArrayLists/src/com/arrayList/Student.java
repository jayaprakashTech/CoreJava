package com.arrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> markList = new ArrayList<Integer>();

	Student(String name, int... markList) {
		this.name = name;
		for (int i : markList) {
			this.markList.add(i);
		}
	}

	int noOfMarks() {
		return markList.size();
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
		return Collections.max(markList);
	}

	int minimumMark() {
		return Collections.min(markList);
	}

	void addMark(int... mark) {
		for (int i : mark) {
			markList.add(i);
		}
	}

	void removeMarkByIndex(int index) {
		markList.remove(index);
	}
	@Override
	public String toString() {
		return name + markList;
	}
}
