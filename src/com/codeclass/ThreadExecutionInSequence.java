package com.codeclass;

public class ThreadExecutionInSequence extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadExecutionInSequence te1 = new ThreadExecutionInSequence();
		ThreadExecutionInSequence te2 = new ThreadExecutionInSequence();
		ThreadExecutionInSequence te3 = new ThreadExecutionInSequence();
		
		te1.start();
		te1.join();
		
		te2.start();
		te2.join();
		
		te3.start();

	}
	
		@Override
		public void run() {
			
			for(int i=1;i<=10;i++) {
				System.out.println("Executing thread : "+i);
			}
		}
}
