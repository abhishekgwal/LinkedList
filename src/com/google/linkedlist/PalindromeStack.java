import java.util.Stack;

public class PalindromeStack {

	static Node head;
	static class Node {
		Node next;
		int data;
		Node (int data) {
			this.data = data;
		}
	}
	
	boolean isPalindrome (Node node) {
		
		Node temp = node; 
		
		Stack<Integer> stack = new Stack<>();
		while (node != null) {
			stack.push(node.data);
			node = node.next;
		}
		
		while (temp != null) {
			if (temp.data != stack.pop())
				return false;
			temp = temp.next;
		}
		return true;
	}
	
	public static void main(String[] args) {

		PalindromeStack list = new PalindromeStack();
		PalindromeStack.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		PalindromeStack.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		boolean isPalindrome = list.isPalindrome(head);
		System.out.println(isPalindrome);
		
	}

}
