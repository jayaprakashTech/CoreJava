package com.arrayList;


public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("jp", 90, 93, 91);
		System.out.println("no " + student.noOfMarks());
		System.out.println("total " + student.totalMarks());
		System.out.println("avg " + student.average());
		System.out.println("max " + student.maximumMark());
		System.out.println("min " + student.minimumMark());
		student.addMark(23, 67, 98);
		student.removeMarkByIndex(4);
		System.out.println(student);
	}

}
