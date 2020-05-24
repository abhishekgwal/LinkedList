import java.util.Stack;

public class PalindromeStackCtci {
	
	static Node head;
	static class Node {
		Node next;
		int data;
		Node (int data) {
			this.data = data;
		}
	}
	
		boolean isPalindrome (Node node) {
			
			Node fast = head;
			Node slow = head;
			
			Stack<Integer> stack = new Stack<>();
			while (fast != null && fast.next != null) {
				stack.push(slow.data);
				fast = fast.next.next;
				slow = slow.next;
			}
			if (fast != null)
				slow = slow.next;
			
			while (slow != null) {
				int top = stack.pop();
				if (top != slow.data)
					return false;
				slow = slow.next;
			}
			return true;
		}

	public static void main(String[] args) {

		PalindromeStackCtci list = new PalindromeStackCtci();
		PalindromeStackCtci.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(2);
		Node fifth = new Node(1);

		PalindromeStackCtci.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		boolean isPalindrome = list.isPalindrome(head);
		System.out.println(isPalindrome);
		
	}

}
