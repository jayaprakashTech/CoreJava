package com.array;

public class StudentRunner {

	public static void main(String[] args) {
		int[] markList = { 90, 93, 91 };
		Student student = new Student("jp", markList);
		System.out.println("no " + student.noOfMarks());
		System.out.println("total " + student.totalMarks());
		System.out.println("avg " + student.average());
		System.out.println("max " + student.maximumMark());
		System.out.println("min " + student.minimumMark());
	}

}
