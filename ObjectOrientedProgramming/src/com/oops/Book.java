package com.oops;

public class Book {
	private int pages;

	Book() {
		this(5);
	}

	Book(int pages) {
		this.pages = pages;
	}

	public int getPages() {
		return this.pages;
	}

	public void setPages(int pages) {
		if (pages > 0) {
		this.pages = pages;
		}
	}

	public void increasePages(int howMuch) {
		setPages(this.pages + howMuch);

	}

	public void decreasePages(int howMuch) {
		setPages(this.pages - howMuch);
	}
	void read() {
		System.out.println("readed");
	}

}
