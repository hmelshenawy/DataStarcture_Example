package dataStracture;

public class BinaryTree {

	Node_Tree root;
	int n=0;

	public BinaryTree() {
		super();
	}

	public void insert(Node_Tree parent_node, int data) {

		Node_Tree newNode = new Node_Tree(data);
		Node_Tree current = parent_node;

		if (root == null) {

			root = newNode;
			n++;

		}
		else if ( newNode.data < parent_node.data ) {

			if (parent_node.left == null) {
				
				parent_node.left = newNode;
				n++;
				
			} else{
				parent_node = parent_node.left;
				insert(parent_node, data);
				
			}
			
		}
		else if (  newNode.data > parent_node.data ) {

			if (parent_node.right == null) {
			
				parent_node.right = newNode;
				n++;
			}else
			{
				parent_node = parent_node.right;
				insert(parent_node, data);
				
			}
		}
	}
	
	public void show(Node_Tree node) {
		
		System.out.println("Current node "+ node.data
						+ " Right node " + node.right.data
						+" Left node " + node.left.data
						+" Tree nodes " +n
				);
		
	}
}
