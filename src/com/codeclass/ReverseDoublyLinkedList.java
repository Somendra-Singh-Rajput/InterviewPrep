package com.codeclass;

public class ReverseDoublyLinkedList {

	static Node head,tail;
	static class Node{
		int data;
		Node next;
		Node prev;


		public Node(int data) {
			this.data=data;
			this.next =null;
			this.prev = null;
		}
	}

	public void addNode(int data) {  
		Node newNode = new Node(data);  

		if(head == null) {  
			head = tail = newNode;  
			head.prev = null;  
			tail.next = null;  
		}  
		else {   
			tail.next = newNode;  
			newNode.prev = tail;  
			tail = newNode;   
			tail.next = null;  
		}  
	}  

	void reverse() {
		Node current = head;
		Node temp = null;

		while(current != null) {
			temp =current.next;
			current.next = current.prev;
			current.prev = temp;
			current = current.prev;

		}
		temp = head;
		head = tail;
		tail = temp;
	}

	void print() {

		Node current = head;

		while(current != null) {  

			System.out.print(current.data + " ");  
			current = current.next;  
		}  
	}

	public static void main(String[] args) {

		ReverseDoublyLinkedList dList = new ReverseDoublyLinkedList();  
		dList.addNode(1);  
		dList.addNode(2);  
		dList.addNode(3);  
		dList.addNode(4);  
		dList.addNode(5);  

		System.out.println("Original List: ");  
		dList.print();  

		dList.reverse();  

		System.out.println("\nReversed List: ");  
		dList.print();  
	}

}
