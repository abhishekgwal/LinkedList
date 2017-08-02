package com.google.linkedlist;

//https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/forum

public class MergeTwoLinkedLists {
	
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
	
	void traverse(Node n) {
		while(n != null) {
			System.out.print(n.data + " ");
			n= n.next;
		}
	}
	
	Node merge(Node p, Node q, Node sorting) {
				
		Node newHead = null;
		if(p == null)
			return q;
		if (q == null)
			return p;
		
		if(p.data <= q.data) {
			sorting = p;
			p = sorting.next;
		}
		else {
			sorting = q;
			q = sorting.next;
		}
		newHead = sorting;
		while (p != null && q != null) {
			if (p.data <= q.data) {
				sorting.next = p;
				sorting = p;
				p = sorting.next;
			}
			else {
				sorting.next = q;
				sorting = q;
				q = sorting.next;
			}
		}
		if (q == null) sorting.next = p;
		if (p == null) sorting.next = q;
		return newHead;
	}

	public static void main(String[] args) {
		
		Node sorting = null;
		
		MergeTwoLinkedLists list1 = new MergeTwoLinkedLists();
		list1.head1 = new Node(10);
		Node second = new Node(50);
		Node third = new Node(70);
		Node fourth = new Node(90);
		Node fifth = new Node(100);
		
		list1.head1.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		MergeTwoLinkedLists list2 = new MergeTwoLinkedLists();
		list2.head2 = new Node(20);
		Node sixth = new Node(30);
		Node seventh = new Node(40);
		Node eighth = new Node(60);
		//Node ninth = new Node(80);
		
		list2.head2.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		//eighth .next = ninth;
		
		MergeTwoLinkedLists obj = new MergeTwoLinkedLists();
				
		System.out.print ("List 1 -> ");
		obj.traverse(head1);
		System.out.println();
		System.out.print("List 2 - > ");
		obj.traverse(head2);
		System.out.println();
		sorting = obj.merge(head1, head2, sorting);
		obj.traverse(sorting);
		
		
	}

}
