package com.Generics;

import java.util.ArrayList;

public class CustomList<T> {
	ArrayList<T> list = new ArrayList<>();

	void addElement(T element) {
		list.add(element);
	}

	T get(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
