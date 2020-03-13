package node;

public class Node {
	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	//all getters and setters
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public boolean hasNext() {
		if (this.next == null)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		  Node n1 = new Node(2018);
		  Node n2 = new Node(2019);

		  n1.setNext(n2);
		  n2.setNext(new Node(2020));

		  printList(n1);

	}
	
	public static void printList(Node currentNode) {
		if (currentNode == null)
			return;

		while (currentNode != null) { 
			//print data
			System.out.println(currentNode.getData()); 	
			//move forward on list
			currentNode = currentNode.getNext();
		}
	}
}
