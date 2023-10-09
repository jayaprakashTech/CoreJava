package com.Functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class OddPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number % 2 == 1;
	}
}

class PrintVoid implements Consumer<Integer> {
	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}

class Mapper implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

public class LambdaBehindScreenRunner {

	static void printOdd(List<Integer> numbers) {
		numbers.stream().filter(new OddPredicate()).map(new Mapper()).forEach(new PrintVoid());

	}
	public static void main(String[] args) {
		printOdd(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

	}

}
