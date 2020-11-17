package com.rahul.executor;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println(" current thread name is :: " + Thread.currentThread().getName());
	}

}
