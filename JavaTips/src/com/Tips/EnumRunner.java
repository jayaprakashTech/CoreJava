package com.Tips;

import java.time.Month;
import java.util.Arrays;

enum Season {
	roman, seth, bobby, brock;

	private static Season[] se = Season.values();

	public static Season get(int n) {
		return se[n - 1];
	}
}
public class EnumRunner {
	static int i;
	int j;

	static class Ass {

		void method() {
			i = 9;
		}
	}

	class Dum {
		void method() {
			i = 9;
			j = 9;
		}
	}
	public static void main(String[] args) {
		Season s1 = Season.roman;
		System.out.println(s1);
		Season s2 = Season.valueOf("brock");
		System.out.println(s2);
		System.out.println(s1.ordinal());
		System.out.println(Season.bobby.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		System.out.println(Month.of(6));
		System.out.println(Season.get(3));
	}

}
