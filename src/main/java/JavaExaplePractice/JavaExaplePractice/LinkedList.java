package JavaExaplePractice.JavaExaplePractice;

public class LinkedList {

	// head of list
	Node head;

	public void push(int data) {
		Node new_node = new Node(data);

		new_node.next = head;
		head = new_node;

	}

	public void printList() {

		while (head != null) {
			System.out.print(head.info + "   ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.head = new Node(1);
		Node secound = new Node(2);
		Node third = new Node(3);

		llist.head.next = secound;
		secound.next = third;

		llist.push(10);

		llist.insertAfter(llist.head.next, 16);

		llist.insertLast(56);
		llist.deleteNodePosition(1);
		llist.printList();
	}

	void deleteNodePosition(int position) {
		// If linked list is empty
		if (head == null)
			return;
		
		 // Store head node 
        Node temp = head; 
        
        // REMOVE FROM BEGIN
        if (position == 0) 
        { 
            head = temp.next;   // Change head 
            return; 
        } 
        
        

	}

	private void insertLast(int new_data) {
		/*
		 * 1. Allocate the Node & 2. Put in the data 3. Set next as null
		 */
		Node new_node = new Node(new_data);

		/*
		 * 4. If the Linked List is empty, then make the new node as head
		 */
		if (head == null) {
			head = new Node(new_data);
			return;
		}

		/*
		 * 4. This new node is going to be the last node, so make next of it as null
		 */
		new_node.next = null;

		/* 5. Else traverse till the last node */
		Node last = head;
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;
		return;

	}

	public void insertAfter(Node prev_node, int data) {
		// TODO Auto-generated method stub
		Node new_node = new Node(data);

		new_node.next = prev_node.next;
		prev_node.next = new_node;

	}

}
