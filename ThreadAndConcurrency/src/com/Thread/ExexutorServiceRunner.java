package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int n;

	Task(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println("task" + n + " started");
		for (int i = n * 101; i <= n * 100 + 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("task" + n + " finished");
	}
}

public class ExexutorServiceRunner {

	public static void main(String[] args) {

		// ExecutorService exService = Executors.newSingleThreadExecutor();
		ExecutorService exService = Executors.newFixedThreadPool(2);

		exService.execute(new Task(1));
		exService.execute(new Task(2));
		exService.execute(new Task(3));
		exService.execute(new Task(4));
		exService.execute(new Task(5));

		exService.shutdown();

	}

}
