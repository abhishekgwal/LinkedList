import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {
	
	static Node head;
	static class Node {
		Node next;
		int data;
		
		Node (int data) {
			this.data = data;
		}
	}
	
	void traverse (Node node) {
		
		node = head;
		while (node != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
	}
	
	Node removeDuplicates (Node node) {
		
		Node temp = node;
		Node prev = null;
		HashSet<Integer> hs = new HashSet<>();
		while (temp != null) {
			if (hs.contains(temp.data)) {
				prev.next = temp.next;
			}
			else {
				hs.add(temp.data);
				prev = temp;
			}
			temp = temp.next;
		}
		return temp;
	}

	public static void main(String[] args) {
		
		RemoveDuplicatesUsingHashSet obj = new RemoveDuplicatesUsingHashSet();
		head = new Node(2);
		Node nodeOne = new Node(4);
		Node nodeTwo = new Node(16);
		Node nodeThree = new Node(2);
		Node nodeFour = new Node(15);
		Node nodeFive = new Node(15);

		head.next = nodeOne;
		nodeOne.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = nodeFour;
		nodeFour.next = nodeFive;
		
		obj.traverse(head);
		obj.removeDuplicates(head);
		System.out.println();
		obj.traverse(head);
		

	}

}
