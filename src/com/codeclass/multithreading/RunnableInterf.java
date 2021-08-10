package com.codeclass.multithreading;

public class RunnableInterf implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			
			System.out.println("I am child thread implementing runnable interface : "+i);
		}
	}

}
