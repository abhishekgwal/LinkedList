package com.google.linkedlist;

//https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
public class NthFromLast {
	
	static Node head;
	static class Node {
		int data;
		Node next;
		Node (int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node nthfromLast(Node curr, int n) {
		curr = head;
		Node follower = curr;
		
		for(int i = 0; i < n; i++){
			curr = curr.next;
			if(curr == null)
				return null;
		}
		
		while (curr.next !=  null) {
			follower = follower.next;
			curr = curr.next;
			}
		return follower;
	}
	
	public static void main(String[] args) {
		
		NthFromLast list = new NthFromLast(); 
		list.head= new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		Node res = list.nthfromLast(head, 0);
		System.out.println(res.data);
		
		}
}
