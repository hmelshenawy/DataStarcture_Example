package dataStracture;

public class Stack {
	
	int size;
	int top;
	int [] arr;
	
	
	public Stack() {
		super();
	}

	
	public Stack(int size) {
		
		// construct the stack with zero items 
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
		
	}
	
	
	void push(int n) {
		
		//it will add the inserted item to the array and increase the top index
		
		if(top == size - 1) {
			
			expand();
			//System.out.println("stack is full");
			
		}
		
		top++;
		arr[top] = n;
		
	}
	
	
	private void expand() {
		
		size = size * 2;
		int[] new_arr = new int[size];
		System.arraycopy(arr, 0, new_arr, 0, arr.length);
		arr = new_arr;
		
	}

	
	void pop() {
		
		// it will remove the top item from the stack
		// by change the top index from the top to previous item
		
		arr[top] = 0;
		top--;
	}

	
	void show() {
		
		//for loop to print all the stack items in order
		
		System.out.println();
		
		for (int i = 0; i <= top; i++) {
			
			System.out.print(arr[i] + " ");
			
		}
	}

	
	public int size() {
		
		System.out.println("\nSize: "+ arr.length + "");
		return arr.length;
	}

}
