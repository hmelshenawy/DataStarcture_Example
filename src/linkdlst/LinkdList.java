package linkdlst;

public class LinkdList {

	public static void main(String[] args) {
		//Node head = new Node(5);
		
		LindListConstruct l1 = new LindListConstruct();
		l1.insert(5);
		l1.insert(10);
		l1.insert(15);
		l1.insert(20);
		l1.insert(25);
		l1.insert(30);
		l1.insert(35);
		
		l1.printList();
		l1.size();
	
		l1.insertAt(0, 10);
		
		l1.printList();
		l1.size();
		
		l1.delete(5);
		l1.delete(45);
		l1.delete(70);
		
		l1.printList();
		l1.size();
		

	
	}
	
	}
	