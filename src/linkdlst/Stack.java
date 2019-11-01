package linkdlst;

public class Stack {
	
	int size;
	int top;
	int [] Data;
	
	
	public Stack(int size) {
		
		// construct the stack with zero items 
		this.size = size;
		this.top = -1;
		this.Data = new int[size];
		
	}
	
	void push(int n) {
		
		//it will add the inserted item to the array and increase the top index
		
		if(top == size - 1) {
			
			System.out.println("stack is full");
			return;
			
		}
		else {
		top++;
		Data[top] = n;
		}
	}
	
	void pop() {
		
		// it will remove the top item from the stack
		// by change the top index from the top to previous item
		
		Data[top] = 0;
		top--;
	}

	
	void show() {
		
		//for loop to print all the stack items in order
		
		System.out.println("\n");
		
		for (int i = 0; i <= top; i++) {
			
			System.out.print(Data[i] + " ");
			
		}
	}


}
