package com.codeclass.multithreading;
import java.util.LinkedList;
import java.util.List;

public class ConsumerProducer {

	LinkedList<Integer> list = new LinkedList<>();
	int listSize = 10;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ConsumerProducer cp = new ConsumerProducer();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
					try {
						cp.producer();
					}catch(InterruptedException ie) {
						ie.printStackTrace();
					}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {

					try {
						cp.consumer();
					}catch(InterruptedException ie) {
						ie.printStackTrace();
					}
				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}
	
	
	public void consumer() throws InterruptedException {
		
		int value = 0;
		
		while(true) {
		synchronized (this) {
			
			while(list.size() == 0) {
				wait();
			}
			
			value = list.removeFirst();
			System.out.println("Consumer consumed : "+value);
			
			notify();
			Thread.sleep(2000);
		}
	  }
		
	}

	public void producer() throws InterruptedException {
	
	int value=0;
	
	while(true) {
	synchronized (this) {
		
		while(list.size() == listSize) {
			wait();
		}
		
		System.out.println("Producer produced : "+value);
		list.add(value++);
		
		notify();
		Thread.sleep(2000);
		
	   }
	  }
		
	}
}
