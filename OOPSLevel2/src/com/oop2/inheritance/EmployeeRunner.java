package com.oop2.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		Person person = new Employee("jp", "9334355431", "support engg");
		System.out.println(person);
		person.setEmail("jp123@gmail.com");
		System.out.println(person);

	}

}
