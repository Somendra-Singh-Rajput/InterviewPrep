package com.codeclass;

public class DeleteGivenNodeOfLinkedList {

	static Node head;
	
	public void push(int data) {
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void print() {
		
		Node current = head;
		while(current != null) {
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
	
	public void delete(int n) {
		
		Node current = head;
		Node prev = null;
		
		if(current != null && current.data == n) {
			head = current.next;
		}
		
		while(current != null && current.data != n) {
			prev = current;
			current = current.next;
		}
		
		if(current == null) {
			return;
		}
		
		prev.next = current.next;
	}
	
	void deleteNode(int position)
    {
        Node temp = head;
        
        Node next = null;
        
        if (head == null)
            return;
        
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }
        
        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
 
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        next = temp.next.next;
 
        temp.next = next;  // Unlink the deleted node from list
    }
	public static void main(String[] args) {
	
		DeleteGivenNodeOfLinkedList delete = new DeleteGivenNodeOfLinkedList();
		delete.push(10);
		delete.push(15);
		delete.push(20);
		delete.push(30);
		delete.push(25);
		
		delete.print();
		System.out.println();
		
		delete.delete(15);
		delete.print();
		System.out.println();
		
		delete.deleteNode(2);
		delete.print();

	}

}
