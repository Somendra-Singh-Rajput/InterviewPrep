package com.codeclass;

public class NthNodeOfLinkedList {

	static Node head;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next = null;
			
		}
	}
	
	public int getNthNode(int index) {
		
		Node current = head;
		
		int count=0;
		
		while(current != null) {
			
			if(count == index) {
				return current.data;
			}
			count++;
			current = current.next;
		}
		
		return 0;
	}
	
	public void push(int data) {
		Node new_node =  new Node(data);
		new_node.next = head;
		head = new_node;
				
	}
	
	public void print() {
		
		Node current = head;
		
		while(current != null) {
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		
		 NthNodeOfLinkedList nl = new NthNodeOfLinkedList();
		 nl.push(10);
		 nl.push(15);
		 nl.push(20);
		 nl.push(30);
		 nl.push(25);
		 
		 System.out.println("--------------:Pushed data is shown below:-----------------");
		 nl.print();
		 System.out.println();
		 System.out.println("----------------:Your node at entered index is :----------------- ");
		 System.out.println(nl.getNthNode(10));
	}

}
