package com.google.linkedlist;

public class DeleteDuplicate {
	
	static Node head;
	static class Node {
		int data;
		Node next;
		Node (int data) {
			this.data = data;
			next = null;
		}
	}
	
	void traverse(Node n) {
		n = head;
		while (n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
	}
	
	Node delDuplicate() {
		Node n = head;
		while (n.next != null) {
			if(n.data == n.next.data)
				n.next = n.next.next;
			else n = n.next;
		}
		return n;
	}

	public static void main(String[] args) {
		
		Node res = null;
		DeleteDuplicate list = new DeleteDuplicate();
		list.head = new Node(1);
		Node second = new Node(1);
		Node second1 = new Node(1);
		Node second2 = new Node(3);
		Node third = new Node(3);
		Node fourth = new Node(3);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		
		list.head.next = second;
		second.next = second1;
		second1.next = second2;
		second2.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		System.out.println("Orignal Linked List = ");
		list.traverse(head);
		res = list.delDuplicate();
		System.out.println();
		System.out.println("Linked List After Duplicate Removal = ");
		list.traverse(res);

	}

}
