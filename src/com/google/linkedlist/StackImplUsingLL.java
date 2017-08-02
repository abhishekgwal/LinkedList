package com.google.linkedlist;

//https://www.youtube.com/watch?v=MuwxQ2IB8lQ
// Stack Implementation using LL. Things to remember:
// Push() - To make your LL work as a stack always insert new node at the head node so that it works as top of the stack.
// Pop() - In the same way, to make your LL work as stack always delete the head node so that it works as pop of the stack.
// I have only implemented the push and pop operations.

public class StackImplUsingLL {

	static Node top;
	static class Node {
		int data;
		Node next; 
		Node(int data) {
			this.data = data;
		}
	}
	
// Insert new node as head node which will become the top element of the stack	
	void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
// Delete the head node	
	void pop() {
		if(top  == null) { // Checks if the stack is empty.
			System.out.println("Stack Empty");
			return;
		}
		top = top.next;
	}
	
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	
	public static void main(String[] args) {
		StackImplUsingLL list = new StackImplUsingLL();
        list.top = new Node(85);
        list.top.next = new Node(15);
        list.top.next.next = new Node(4);
        list.top.next.next.next = new Node(20);
        //list.printList(top);
        list.push(70);
        list.printList(top);
        System.out.println();
        list.pop();
        list.printList(top);
        list.pop();
        System.out.println();
        list.printList(top);
	}

}
