package com.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static double sumOfList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number i : numbers) {
			sum = sum + i.doubleValue();
		}
		return sum;
	}

	static void addValue(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.3);
		numbers.add(1.0f);
		numbers.add(1l);
	}
	public static void main(String[] args) {
		CustomList<String> custom = new CustomList<>();
		custom.addElement("element 1");
		custom.addElement("element 2");
		System.out.println(custom);
		System.out.println(custom.get(0));

		CustomList<Integer> custom1 = new CustomList<>();
		custom1.addElement(123);
		custom1.addElement(789);
		System.out.println(custom1);
		System.out.println(custom1.get(0));

		System.out.println(doubleValue(432));

		ArrayList<Integer> numbers = new ArrayList(List.of(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);

		System.out.println(sumOfList(List.of(1.1, 1.7, 4.5)));
		System.out.println(sumOfList(List.of(1, 2, 4)));
		System.out.println(sumOfList(List.of(1l, 1l, 4l)));

		List<Number> empty = new ArrayList<>();
		addValue(empty);
		System.out.println(empty);
	}


}
