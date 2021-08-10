package com.codeclass;

import com.codeclass.NthNodeOfLinkedList.Node;

public class NthNodeFromEndOfLinkedList {

static Node head;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next = null;
			
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;	
	}
	
	public void print() {
		Node current =  head;
		
		while(current != null) {
			System.out.println(current.data+ " ");
			current = current.next;
		}
	}
	
	public void getNthNodeFromEnd(int index) {
		
		int n = 0;
		Node current = head;
		while(current != null) {
			current = current.next;
			n++;
		}
		
		if(n < index) {
			return;
		}
		
		current = head;
		
		for(int i=1;i<n-index+1;i++) {
			current = current.next;
		}
		
		System.out.println(current.data+" ");
	}
	
	public static void getNthNodeFromLast(Node node,int n) {
		
		int i = 0;
		   
	    if (node == null)
	        return;
	    
	    getNthNodeFromLast(node.next, n);
	   
	    if (++i == n)
	        System.out.print(node.data);
	}
	
	public static void main(String[] args) {
		
		NthNodeFromEndOfLinkedList llist = new NthNodeFromEndOfLinkedList(); 
		
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
        
        llist.print();
        System.out.println();
 
        llist.getNthNodeFromEnd(2);
        
        System.out.println();
        getNthNodeFromLast(head, 2);

	}

}
