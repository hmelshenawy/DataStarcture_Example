package dataStracture;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("_______LINKEDLIST__________\n");

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

		System.out.println("__________STACK____________\n");

		Stack stack = new Stack(4);

		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);

		stack.show();
		stack.size();

		stack.push(15);
		stack.push(20);

		stack.show();
		stack.size();
		
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		
		stack.show();
		stack.size();
		
		System.out.println("____________QUEUE__________\n");
		
		Queue q = new Queue(4);
		
		q.enqueue(5);
		q.enqueue(10);
		q.show();
		q.enqueue(15);
		q.enqueue(20);
		
		q.show();
		
		q.enqueue(20);
		
		q.dequeue();
		
		q.show();
		
		q.dequeue();
		
		q.show();
		
		q.enqueue(25);
		
		q.show();
		
		q.enqueue(30);
		
		q.show();
		
		q.dequeue();
		q.show();
		q.enqueue(35);
		q.show();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.show();
		
		System.out.println(",,,,,,,,,,,,,,,Binary Tree,,,,,,,,,,,,,\n");
		
		BinaryTree tree = new BinaryTree();
		
		tree.insert(tree.root, 11);
		tree.insert(tree.root, 6);
		tree.insert(tree.root, 8);
		tree.insert(tree.root, 19);
		tree.insert(tree.root, 4);
		tree.insert(tree.root, 10);
		tree.insert(tree.root, 5);
		tree.insert(tree.root, 17);
		tree.insert(tree.root, 43);
		tree.insert(tree.root, 49);
		tree.insert(tree.root, 31);
		tree.insert(tree.root, 2);
		tree.insert(tree.root, 7);
		tree.insert(tree.root, 12);
		tree.insert(tree.root, 18);
		
		tree.show(tree.root);
		tree.show(tree.root.right);
		tree.show(tree.root.right.left);
		tree.show(tree.root.left.right);

	}
}
