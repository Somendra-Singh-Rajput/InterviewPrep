package com.codeclass.multithreading;

public class ThreadClass extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("I am child thread by extending thread class : "+i+" and Priority is : "+Thread.currentThread().getPriority());
		}
	}
}
