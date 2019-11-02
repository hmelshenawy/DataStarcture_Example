package dataStracture;

public class Queue {
	
	// implementation of circle queue.

	int front = 0;
	int rear = 0;
	int size = 0;
	int[] queue;
	int lenght;
	
	
	public Queue(int lenght) {

		this.lenght = lenght;
		queue = new int[lenght];
	}
	
	public void enqueue(int data) {
		
		// if queue is full will show message and return.
		
		if (size == lenght) {
			
			System.out.println("Queue is full");
			return;
			
		} // if rear at the end and front of the queue is empty
		// will add the item in front of the queue.
		
		 if (rear == lenght && front != 0) {
			
			rear = 0;
			queue[rear] = data;
			rear++;
		}
		else {
		queue[rear] = data;
		rear++;

		}
		size++;
	}
	
	public void dequeue() {
		
		// if front = rear = zero that mean queue is empty(no items added yet)..
		
		if (size == 0) {
			System.out.println("Queue is already empty!!");
		}
		else {
			
			if (front == lenght - 1) {
				
				// if front is at the end of the queue it will remove the item
				// and return front to the start of the queue.
				
				queue[front] = 0;
				front =0;
				size--;
				
			}
			else {
				
				//remove front item and increase front index by 1.
				
		queue[front] = 0;
		front++;
		size--;
			}
		}
	}
	
	public void show() {
		
		if (rear <= front && size !=0) {
			
	// if rear is smaller than front it will print front front to end
			//then print the remaining item from zero to rear.
			
		for (int i = front; i < lenght; i++) {
			System.out.print(queue[i]+ "f ");
		}
		for (int i = 0; i < rear; i++) {
			System.out.print(queue[i]+ "r ");
		}
		}
		else {
			// if rear is larger than front it will print from front to rear onetime
			
			for (int i = front; i < rear; i++) {
				System.out.print(queue[i]+ "d ");
			}	
		}
		
		// will print queue size
		
		System.out.println("Size: "+ size);
		
	}
	
	public int size() {
		
		System.out.println("Size: "+ size);
		return size;
	}
}
