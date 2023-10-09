package com.Thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exService = Executors.newFixedThreadPool(3);

		List<CallableTask> list = List.of(new CallableTask("ajay"), new CallableTask("bala"), new CallableTask("raj"));

		List<Future<String>> future = exService.invokeAll(list);

		for (Future<String> i : future) {
			System.out.println(i.get());
		}

		exService.shutdown();

	}

}
