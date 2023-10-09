package com.Thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnyOneCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exService = Executors.newFixedThreadPool(3);

		List<CallableTask> list = List.of(new CallableTask("ajay"), new CallableTask("bala"), new CallableTask("raj"));

		String string = exService.invokeAny(list);

		System.out.println(string);

		exService.shutdown();

	}

}
