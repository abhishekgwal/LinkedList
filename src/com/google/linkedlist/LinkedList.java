//For complete implementation go to: http://quiz.geeksforgeeks.org/linked-list-set-1-introduction/

package com.google.linkedlist;

public class LinkedList {

	Node head;

	// Linked list Node
	static class Node {
		int data;
		Node next;  //Next pointer reference created

		// Constructor to create a new node
		// Next is by default initialized as null
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Inserting front of the Linked List
	public void insertFront(int new_data) {

		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// Inserting end of the Linked List
	public void insertEnd(int new_data) {
		Node node = new Node(new_data);
		node.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = node;
		return;
	}

	// Traversing the Linked List
	public void printList() {
		Node n = head;
		if (head == null)
			System.out.println("Linked List Empty.");
		while (n != null) {
			System.out.print(n.data +  " ");
			n = n.next;
		}
	}
	
	public void reverseList(){
		
	}

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		llist.head = new Node(4);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(2);

		llist.head.next = second;
		second.next = third;
		third.next = fourth;

		llist.printList();

		/*
		 * llist.insertFront(5);
		 * 
		 * llist.printList();
		 * 
		 * llist.insertEnd(15);
		 * 
		 * llist.printList();
		 */

	}

}
