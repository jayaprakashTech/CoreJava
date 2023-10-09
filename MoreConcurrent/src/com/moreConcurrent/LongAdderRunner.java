package com.moreConcurrent;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderRunner extends Thread {

	public static void main(String[] args) {

		Map<Character, LongAdder> map = new Hashtable<>();
		String str = "this is beautiful bird";
		char[] ch = str.toCharArray();

		for (char i : ch) {
			LongAdder longadder = map.get(i);
			if (longadder == null) {
				map.put(i, longadder = new LongAdder());
			}
			longadder.increment();
			map.put(i, longadder);
		}
		LongAdderRunner l1 = new LongAdderRunner();
		l1.start();
		System.out.println(map);
	}

}
