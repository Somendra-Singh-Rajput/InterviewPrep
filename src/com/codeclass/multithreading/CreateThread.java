package com.codeclass.multithreading;

public class CreateThread {

	public static void main(String[] args) throws InterruptedException {
	
		ThreadClass tc = new ThreadClass();
		tc.start();
		
		RunnableInterf ri = new RunnableInterf();
		Thread t = new Thread(ri);
		t.start();
		
		tc.join();
		t.join();
		
		for(int i=1;i<=10;i++) {
			System.out.println("I am main thread : "+i);
		}
	}

}
