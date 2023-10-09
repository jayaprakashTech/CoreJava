package com.oops2;

public class BookRunner extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(10, "shade of dr", "vijay");
		System.out.println(book);
		book.addReview(new Review(10, "super", 98));
		System.out.println(book);
	}

}
