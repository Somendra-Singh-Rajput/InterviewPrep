package com.codeclass.multithreading;

public class DemonThread {

	public static void main(String[] args) {
	
		ThreadClass tc = new ThreadClass();
		
		tc.setPriority(1);
		tc.setDaemon(true);
		
		tc.start();
		int n = 0;
		
		while(n<=10) {
			System.out.println("I am main thread : "+n+" and Priority is : "+Thread.currentThread().getPriority());
			n++;
		}

	}

}
