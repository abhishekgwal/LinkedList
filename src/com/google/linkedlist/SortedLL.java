package com.google.linkedlist;

public class SortedLL {
	
	static Node head;
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	void traverse() {
		Node n = head;
		while (n !=null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
	}
	
	void bsortList(Node head) {
		Node i, j;
		int temp;
		
		for(i= head; i.next != null; i=i.next) {
			for(j = i.next; j !=null; j=j.next) {
				if(i.data > j.data) {
					temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		SortedLL list = new SortedLL();
		list.head = new Node(4);
		Node second = new Node(8);
		Node third = new Node(5);
		Node fourth = new Node(2);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		list.bsortList(head);
		System.out.println("Sorted LL is - ");
		list.traverse();

	}

}
