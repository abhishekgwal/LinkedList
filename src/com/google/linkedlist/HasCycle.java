package com.google.linkedlist;

public class HasCycle {
	
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	void traverse(Node n) {
		n = head;
		while (n != null){
			System.out.print(n.data + " -> ");
			n = n.next;
		}
	}
	
	boolean hasCycle (Node head) {
		Node f, s;
		f = head;
		s = head;
		while ( f != null && s != null && f.next != null) {
		f = f.next.next;
		s = s.next;
		if ( f == s)
		return true;
		}
		return false;
	}

	
	public static void main(String[] args) {

		HasCycle list = new HasCycle();
		list.head = new Node(5);
		Node second = new Node(1);
		Node third = new Node(6);
		Node fourth = new Node(2);
		Node fifth = new Node(4);
		Node sixth = new Node(8);
		Node seventh = new Node(3);
		Node eighth = new Node(7);
		Node ninth = new Node(9);
		Node tenth = new Node(10);
		
		head.next =second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		eighth.next = ninth;
		ninth.next = tenth;
		ninth.next = fourth;
		
		boolean b = list.hasCycle(head);
		System.out.println("Is Linked List Cyclic - "+b);
		
	}

}
