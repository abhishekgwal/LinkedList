package com.google.linkedlist; 

   class SortingLinkedList {

	static Node head;
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

//Print element of the linked list

	void traverse() {
		Node n = head;
		while(n !=null) {
			System.out.print(n.data +" -> ");
			n = n.next;
		}
	}

//Append element into the linked list	

	Node appendElement (int l) {
		Node last = new Node(l);
	
		Node n =head;
		while (n.next != null) {
			n = n.next;
		}
		 n.next = last;
		return n;
	}

//Remove tail element from the linked list

	Node deleteLastNode() {
		Node n = head;
		Node prev = null;
		while(n.next != null) {
			prev = n;
			n = n.next;
		}
		prev.next = null;
		
		return prev;
		
	}

//Remove elements greater than target element
/* For this part, let's assume you have a linked list 11-> 2 -> 5 -> 4 -> 6 -> 1 -> 13 -> null
Now, I want to delete all the elements greater than my target element (5). So, the output becomes 2 -> 5 -> 4 -> 1 -> null

Logic which I used: I will traverse through the linked list and then compare each element with my target element. 
If the traversed element is greater than my target element then I will remove that node and connect to its next node 
(For this part, I created a separate method deleteNode(int n) which deletes node based upon the given node number). 
I will create new linked list every time by removing one element at a time from the given linked list using deleteNode method. 
Finally I will have a linked list which will remove all elements greater than target value.
 */

     Node removeElements (int n) {
     Node temp = head;
     int count = 0;
     while (temp != null) {
        if(temp.data >n) {
        count = count + 1;
        deleteNode(count);
   }
        count = count + 1;
        temp = temp.next;
   }
        return temp;
   }

Node deleteNode(int n) {
		
		if(n == 1) {
			Node temp = head;
			temp = temp.next;
			head = temp;
return temp;
		}
		else {
			
		Node temp1 = head;
				
		for(int i = 0; i <  n - 2; i++) {
			temp1 = temp1.next;
		}
		Node temp2 = temp1.next;
		temp1.next = temp2.next;
		
		return temp1;
	}
	}
public static void main(String[] args) {

	SortingLinkedList list = new SortingLinkedList();
	
	list.head = new Node(4);
	Node second = new Node(8);
	Node third = new Node(5);
	Node fourth = new Node(2);
	
	
	list.head.next = second;
	second.next = third;
	third.next = fourth;
	
	
	 //Prints all elements 2 -> 4 -> 6 -> 5 -> 10
	//list.appendElement(14); // 2 -> 4 -> 6 -> 5 -> 10 -> 14
	
	list.deleteNode(3);// 2 -> 4 -> 5 -> 10 -> 14
	list.traverse(); 
//	list.removeElements(5);//2 -> 4 -> 5
}
}