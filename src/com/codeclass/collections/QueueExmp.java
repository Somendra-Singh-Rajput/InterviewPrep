package com.codeclass.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExmp {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println(queue);
		
		PriorityQueue<Integer> pirorityQueue = new PriorityQueue<>();

		pirorityQueue.add(1);
		pirorityQueue.add(2);
		pirorityQueue.add(3);
		pirorityQueue.add(3);
		pirorityQueue.add(4);
		pirorityQueue.add(5);
		pirorityQueue.offer(10);
		
		System.out.println(pirorityQueue);


	}

}
