class Node {
	public int data;
	public Node next;

  public Node(int data, Node next){
			this.data = data;
			this.next = next;
	}
}

class List {

	Node root;

	public List(Node root){
		this.root = root;
		System.out.println("List initiated with root "+this.root.data);
	}

	public void addNode(Node n) {

		Node current = root;
		 while(current.next!=null){
		 	current = current.next;
		 }

		 current.next = n;
	}

	public void removeLastNode() {
		Node current = root;
		Node previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		System.out.println("Removed node "+current.data);
		previous.next = null;
	}

	public void removeNodesGreaterThan(int value) {
		Node current = root;
		Node previous = null;

		while(current != null) {

			if(current.data > value) {
				if(previous == null) { // first node
					previous = current.next;
					this.root = previous;
				}
				else {
					Node temp = previous;
					previous.next = current.next;
					previous = temp;
				}
			}
			else
				previous = current;

			current = current.next;
		}

		System.out.println("Removed nodes greater than "+value);
	}

	public void printList() {

		Node current = root;
		System.out.println("");
		while(current!=null){
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println("");
	}

}

public class LinkedList {

   public static void main(String args[]) {
        List list = new List(new Node(1,null) ); // Task 1
				list.printList();
				list.addNode(new Node(2,null));
				list.addNode(new Node(3,null));
				list.addNode(new Node(4,null));
				list.addNode(new Node(5,null));
				list.addNode(new Node(6,null));
				list.addNode(new Node(7,null));
				list.addNode(new Node(8,null));
				list.printList();
				list.removeLastNode(); // Task 2
				list.printList();
				 list.removeNodesGreaterThan(5); // Task 3

				list.printList();

   }

}
