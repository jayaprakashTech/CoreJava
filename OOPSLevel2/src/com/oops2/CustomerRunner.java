package com.oops2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address home = new Address("7g", "madurai", "625006");
		Customer customer = new Customer("jp", home);
		Address work = new Address("12d", "chennai", "12345");
		System.out.println(customer);
		customer.setWork(work);
		System.out.println(customer);
	}

}
