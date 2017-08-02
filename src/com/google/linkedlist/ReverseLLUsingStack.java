package com.google.linkedlist;

//https://www.youtube.com/watch?v=hNP72JdOIgY&t=494s

import java.util.Stack;

public class ReverseLLUsingStack {

	static Node head;
	static class Node{
	    int data;
	    Node next;
	    Node(int data) {
	        this.data = data;
	    }
	}
	
	void print(Node temp) {
		temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			}
	}
	
	void reverse() {
// Push the address of LL to stack
		Node temp;
		temp = head;
		Stack<Node> stack = new Stack<>();
		while(temp != null) {
		stack.push(temp);
		temp = temp.next;
		}

		//temp = stack.peek();
		temp = stack.pop();
		head = temp;
	
// Pop the address from stack and reverse the LL		
		while(!stack.isEmpty()) {
			temp.next = stack.peek();    
			temp = stack.pop(); //100
		}
			temp.next = null;
	}
	
	public static void main(String[] args) {
		
		 ReverseLLUsingStack list = new ReverseLLUsingStack();
	        list.head = new Node(85);
	        list.head.next = new Node(15);
	        list.head.next.next = new Node(4);
	        list.head.next.next.next = new Node(20);
	        System.out.print("Given LL = ");
	        list.print(head);
	        list.reverse();
	        System.out.println();
	        System.out.print("Reverse LL = ");
	        list.print(head);

	}

}
