package com.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artofcomputerprogramming = new Book(23);
		Book effectivejava = new Book();
		Book cleancode = new Book(700);
		System.out.println(cleancode.getPages());
		System.out.println(effectivejava.getPages());
		// cleancode.setPages(200);
		cleancode.increasePages(100);
		cleancode.decreasePages(301);
		System.out.println(cleancode.getPages());
		System.out.println(effectivejava.getPages());
	}

}
