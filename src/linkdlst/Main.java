package linkdlst;

public class Main {

	public static void main(String[] args) {
		//Node head = new Node(5);
		
		LinkedList l1 = new LinkedList();
		l1.insert(5);
		l1.insert(10);
		l1.insert(15);
		l1.insert(20);
		l1.insert(25);
		l1.insert(30);
		l1.insert(35);

		l1.insertAt(0, 10);
		
		l1.delete(5);
		l1.delete(45);
		l1.delete(70);
		
		l1.printList();
		l1.size();
		
		System.out.println("______________________");
		
		Stack stack = new Stack(5);
		
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		
		stack.show();
		
		stack.pop();
		
		stack.show();

	
	}
	
	}
	