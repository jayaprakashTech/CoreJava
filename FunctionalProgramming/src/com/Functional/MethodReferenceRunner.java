package com.Functional;

import java.util.List;

public class MethodReferenceRunner {

	static boolean filtering(Integer n) {
		return n % 2 == 0;
	}

	static Integer mapping(Integer n) {
		return n * n;
	}


	public static void main(String[] args) {

		// without method reference
		Integer s1 = List.of(23, 12, 14, 15, 18).stream().filter(i -> i % 2 == 0).map(i -> i * i)
				.min((i1, i2) -> Integer.compare(i1, i2)).get();

		List.of("Apple", "Eat", "Bat").stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));

		// with method reference
		Integer s2 = List.of(23, 12, 14, 15, 18).stream().filter(MethodReferenceRunner::filtering)
				.map(MethodReferenceRunner::mapping).min(Integer::compare).get();

		List.of("Apple", "Eat", "Bat").stream().map(String::toUpperCase).forEach(System.out::println);

		// result
		System.out.println(s1);
		System.out.println(s2);

	}

}
