package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	private String n;

	CallableTask(String n) {
		this.n = n;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(10000);
		return "Hello " + n;
	}
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService exService = Executors.newFixedThreadPool(1);
		Future<String> future = exService.submit(new CallableTask("jp"));
		Future<String> future1 = exService.submit(new CallableTask("ram"));

		System.out.println("welcome");

		System.out.println(future.get());
		System.out.println(future1.get());

		System.out.println("thank u");

		exService.shutdown();
	}

}
