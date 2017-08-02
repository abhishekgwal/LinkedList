package com.google.linkedlist;

//http://stackoverflow.com/questions/36210160/segregate-even-and-odd-nodes-in-a-linked-list
//Bug in this program - Needs to be fixed

public class SegregateEvenAndOdd {
	
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	
	static Node evenHead = null;
	Node evenTail = null;

	static Node oddHead = null;
	Node oddTail = null;
	
	void print(Node node) {
		node = head;
		while (node!= null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	

	Node segregate(Node head) {
		
	while (head != null) {
	    if(head.data % 2 == 0) {
	        if (evenHead == null) {
	            // The even list is empty, set the head and tail
	            evenHead = new Node(head.data);
	            evenTail = evenHead;
	            head = head.next;
	        } else {
	            // Append to the end of the even list
	            evenTail.next = new Node(head.data);
	            evenTail = evenTail.next;
	            head = head.next;
	        }
	    } else {
	    	if(head.data % 2 == 1) {
		        if (oddHead == null) {
		            // The even list is empty, set the head and tail
		            oddHead = new Node(head.data);
		            oddTail = oddHead;
		            head = head.next;
		        } else {
		            // Append to the end of the even list
		            oddTail.next = new Node(head.data);
		            oddTail = oddTail.next;
		            head = head.next;
		        }
		    }
	   }
	}
	return head;
}

	public static void main(String[] args) {
		SegregateEvenAndOdd list = new SegregateEvenAndOdd();
        head = new Node(8);
        head.next = new Node(12);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(6);
        System.out.print("Orignal List = ");
        list.print(head);
        System.out.println();
        list.segregate(evenHead);
        System.out.println("Segregate List = ");
        list.print(head);
        
	}

}
