package com.moreConcurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner extends Thread {

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> map = new ConcurrentHashMap<>();
		String str = "this is beautiful bird";
		char[] ch = str.toCharArray();

		for (char i : ch) {
			map.computeIfAbsent(i, j -> new LongAdder()).increment();
		}
		ConcurrentMapRunner c1 = new ConcurrentMapRunner();
		c1.start();
		System.out.println(map);
	}

	}


