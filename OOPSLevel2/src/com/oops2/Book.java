package com.oops2;

import java.util.ArrayList;
public class Book {
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> review = new ArrayList<Review>();

	Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	void addReview(Review review) {
		this.review.add(review);
	}

	@Override
	public String toString() {
		return String.format("id-%d,name-%s,author-%s,review-%s", id, name, author, review);
	}
}
