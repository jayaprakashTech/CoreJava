package com.Functional;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalRunner {

	static void printOdd(List<Integer> numbers) {
		numbers.stream().filter(i -> i % 2 == 1).forEach(i -> System.out.println(i));

	}

	static Integer sumOfList(List<Integer> numbers) {
		Integer sum = numbers.stream().reduce(0, (i1, i2) -> i1 + i2);
		return sum;
	}

	static Integer sumOfOdd(List<Integer> numbers) {
		return numbers.stream().filter(i -> i % 2 == 1).reduce(0, (i1, i2) -> i1 + i2);

	}

	static Integer sumOfOddWithBrace(List<Integer> numbers) {
		return numbers.stream().filter(i -> i % 2 == 1).reduce(0, (i1, i2) -> {
			System.out.println(i1 + "  " + i2);
			return i1 + i2;
		});
	}

	static void intermediate(List<Integer> numbers) {
		numbers.stream().distinct().sorted().forEach(i -> System.out.println(i));
	}

	static Integer minimum(List<Integer> numbers) {
		return numbers.stream().map(i -> i * i).min((i1, i2) -> Integer.compare(i1, i2)).get();
	}

	static List collectList(List<Integer> numbers) {
		return numbers.stream().map(i -> i * i).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		printOdd(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println(sumOfList(List.of(2, 4, 5, 1, 9, 7)));

		System.out.println(sumOfOdd(List.of(1, 2, 3, 4, 5, 6, 7)));

		System.out.println(sumOfOddWithBrace(List.of(1, 2, 3, 4, 5, 6, 7)));

		intermediate(List.of(1, 2, 2, 6, 1, 7, 3, 3, 1, 5));

		System.out.println(minimum(List.of(23, 12, 53)));

		System.out.println(collectList(List.of(12, 23, 53)));

	}

}
