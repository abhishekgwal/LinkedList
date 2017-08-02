package com.google.linkedlist;

//https://www.hackerrank.com/challenges/compare-two-linked-lists

public class CompareTwoLinkedList {

	static Node head1;
	static Node head2;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	int compare(Node head1, Node head2) {
		
		Node temp1, temp2;
		temp1 = head1;
		temp2 = head2;

		while (temp1.data == temp2.data) {
			temp1 = temp1.next;
			temp2 = temp2.next;

			if (temp1 == null && temp2 == null)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {

		CompareTwoLinkedList list1 = new CompareTwoLinkedList();
		list1.head1 = new Node(5);
		Node second = new Node(18);
		Node third = new Node(4);
		Node fourth = new Node(9);
	
		list1.head1.next = second;
		second.next = third;
		third.next = fourth;
	
		CompareTwoLinkedList list2 = new CompareTwoLinkedList();
		list2.head2 = new Node(5);
		Node second2 = new Node(18);
		Node third3 = new Node(4);
		Node fourth4 = new Node(9);
		
		list2.head2.next = second2;
		second2.next = third3;
		third3.next = fourth4;
		
		CompareTwoLinkedList obj = new CompareTwoLinkedList();
		int n = obj.compare(head1, head2);
		System.out.println(n);

	}

}
