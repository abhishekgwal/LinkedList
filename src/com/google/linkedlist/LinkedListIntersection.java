import java.util.HashSet;
import java.util.Set;

public class LinkedListIntersection {

	static Node head, head2;

	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	Node intersect(Node n1, Node n2) {
		Set<Node> set1 = new HashSet<>();
		while (n1 != null) {
			set1.add(n1);
			n1 = n1.next;
		}

		while (n2 != null) {
			if (set1.contains(n2))
				return n2;
			else
				n2 = n2.next;
		}
		return null;
	}

	public static void main(String[] args) {

		LinkedListIntersection obj = new LinkedListIntersection();
		LinkedListIntersection.head = new Node(0);
		Node nodeOne = new Node(9);
		Node nodeTwo = new Node(1);
		Node nodeThree = new Node(2);
		Node nodeFour = new Node(4);

		head.next = nodeOne;
		nodeOne.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = nodeFour;

		LinkedListIntersection.head2 = new Node(3);

		head2.next = nodeThree;

		Node result = obj.intersect(head, head2);
		System.out.println(result.data);

	}
}
