public class PalindromeIterative {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node reverse(Node node) {

		Node temp = null;
		while (node != null) {
			Node n = new Node(node.data);
			n.next = temp;
			temp = n;
			node = node.next;
		}
		return temp;
	}

	boolean isPalindrome(Node LinkedList) {
		Node rev = reverse(LinkedList);
		while (LinkedList != null && rev != null) {
			if (LinkedList.data != rev.data)
				return false;
			else {
				LinkedList = LinkedList.next;
				rev = rev.next;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		PalindromeIterative list = new PalindromeIterative();
		PalindromeIterative.head = new Node(1);
		Node second = new Node(3);
		Node third = new Node(2);
		Node fourth = new Node(3);
		Node fifth = new Node(1);

		PalindromeIterative.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		boolean palindrome = list.isPalindrome(head);
		System.out.println(palindrome);

	}

}