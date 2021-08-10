package com.codeclass.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExpl {

	public static void main(String[] args) {
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		System.out.println("Available processors count is : "+coreCount);
		for(int i=1;i<=100;i++) {
			service.execute(new Task());
		}

	}
	
	static class Task implements Runnable{

		@Override
		public void run() {
		
			System.out.println("Child thread");
		}
		
	}


}

