package com.Thread;


class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("task 1 started");
		for (int i = 101; i <= 200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("task 1 finished");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("task 2 started");
		for (int i = 201; i <= 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("task 2 finished");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("task1 kick off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();


		System.out.println("task2 kick off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		task1.join();
		task2Thread.join();

		System.out.println("task3 kick off");
		for (int i = 301; i <= 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("task 3 finished");
	}

}
