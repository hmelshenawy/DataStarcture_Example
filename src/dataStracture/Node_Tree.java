package dataStracture;

public class Node_Tree {
	
	Integer data= null;
	Node_Tree right ;
	Node_Tree left ;
	int index;
	
	public Node_Tree(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	
	}
	
	
	public Node_Tree() {
		//this.left.index = 2*index +1;
		//this.right.index = 2*index +2;
		
	}
	
	
	public Node_Tree(int data, int index) {
		this.data = data;
		this.index = index;
		//this.left.index = 2*this.index +1;
		//this.right.index = 2*this.index +2;
	}

	
	public int getData() {
		return data;
	}

	
	public void setData(int data) {
		this.data = data;
	}

	
	public Node_Tree getRight() {
		return right;
	}

	
	public void setRight(Node_Tree right) {
		this.right = right;
	}

	
	public Node_Tree getLeft() {
		return left;
	}

	
	public void setLeft(Node_Tree left) {
		this.left = left;
	}

	
	public int getIndex() {
		return index;
	}

	
	public void setIndex(int index) {
		this.index = index;
	}
	
}
