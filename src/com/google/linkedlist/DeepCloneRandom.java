package com.google.linkedlist;


//https://www.youtube.com/watch?v=xF9goDxk5nM
public class DeepCloneRandom {
	
	static Node head;
	static class Node {
		int data;
		Node next;
		Node random;
		
		Node (int data) {
			this.data = data;
			next = null;
			}
	}
	
	void traverse() {
		
		Node n = head;
		while (n != null) {
			System.out.print(n.data+ " -> ");
			n = n.next;
		}
	}
	
	public Node cloneNoExtraSpace(Node n) {
	    if (n == null) return n;
	 
	    //Step 1:
	    
	    Node nCurr = n;
	    while (nCurr != null) {
	        Node temp = new Node(n.data);
	        temp.data = nCurr.data;
	        temp.next = nCurr.next;
	        nCurr.next = temp;
	        nCurr = nCurr.next.next;
	    }
	 
	    //Step 2:
	    
	    nCurr = n;
	    while (nCurr != null) {
	        nCurr.next.random = nCurr.random.next;
	        nCurr = nCurr.next.next;
	    }
	    
	    //Step 3:
	 
	    Node copy = n.next; 
	    nCurr = n;
	    while (nCurr.next != null) {
	        Node tmp = nCurr.next;
	        nCurr.next = nCurr.next.next;
	        nCurr = tmp;
	    }
	 
	    return copy;
	}
	
	public static void main(String[] args) {
		
		DeepCloneRandom list = new DeepCloneRandom();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		
		third = list.head.random;
		list.head = second.random;
		third = fourth.random;
		fourth = second.random;
		
		list.traverse();
	}

}
