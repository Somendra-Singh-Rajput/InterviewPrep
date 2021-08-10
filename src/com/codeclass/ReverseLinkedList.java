package com.codeclass;

public class ReverseLinkedList {

	static Node head;

	static class Node{

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next =null;
		}
	}

	Node reverse(Node head) {

		Node current = head;
		Node next = null;
		Node prev = null;

		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;

		return head;
	}

	void print(Node head) {

		while(head != null) {
			System.out.println(head.data+" ");
			head = head.next;
		}

	}

	public static void main(String[] args) {

		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.print(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.print(head);

	}

}
