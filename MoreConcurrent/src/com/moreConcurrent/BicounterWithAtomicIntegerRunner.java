package com.moreConcurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class BicounterWithAtomicIntegerRunner extends Thread {

	private AtomicInteger i = new AtomicInteger(0);

	void increement() {
		i.incrementAndGet();
	}

	int get() {
		return i.get();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BicounterWithAtomicIntegerRunner i1 = new BicounterWithAtomicIntegerRunner();
		i1.start();
		i1.increement();
		i1.increement();
		i1.increement();
		System.out.println(i1.get());
	}

}
