package dataStracture;

public class LinkedList {
	
	public Node head;

	public LinkedList() {
		this.head = null;
	}	
	
	public void insert(int id) {
		
		Node newNode = new Node(id);
		
		if (head == null) {
			head = newNode;

		}
		else {
			
			Node last = head;
			
			while(last.next != null) 
			{
				last = last.next;
			}
			
			last.next = newNode;
			
		}
	}
	
	public void delete(int id) {
		
		 Node current = head;
		 Node prev = null;
		 
		 if (current.data == id) {
			 head = current.next;
			 System.out.println(id + " head has been Deleted !!");
}
		 else {
			 while (current.data != id && current.next != null) 
			 	{
				 prev = current;
				 current =current.next;
				 }
			
			if (current.data == id) {
				System.out.println(id + " has been Deleted !!");
				prev.next = current.next;
			}
			else if (current.next == null) {
				System.out.println(id +" Element not Found !!");
}
		 }
	}
	
	public void deleteByIndex(int i) {
		
		if (i==0) {
			head = head.next;
			System.out.println("Head Deleted");
}
		
		else {
		Node current = head;
		Node prev = null;
		try {
			for (int j = 0; j <= i-1 ; j++) {
				prev = current;
				current = current.next;
				
			}
			System.out.println( current.data + " Element Deleted");
			prev.next = current.next;
		} catch (NullPointerException e) {
			System.out.println("Elment not found");
		}
}
	}
	
	
	public void insertAt(int index, int data) {
		
		Node node = new Node(data);
		
		Node last = head;
		if(index == 0) {
			
			node.next = head;
			head = node;
			
			
		}
		else {
		for (int i = 0; i < index-1; i++) {
			
			last = last.next;
			
		}
		
		node.next = last.next;
		last.next = node;
		}
		
		System.out.println(data+" insterted at "+ index);
	}
	
	
	public void printList() {
		
		Node current = head;
		
		while (current.next != null) {
			System.out.print(current.data+ "  ");
			current = current.next;	
		}
		System.out.println(current.data);
	}
	
	public int size() {
		int i = 1;
		Node current = head;
		//Node last = null;
		
		while (current.next != null) {
			current = current.next;
			i++;
		} System.out.println("Array size = " + i);
		return i;
		
	}

}
