//author : Anuja Nagare anuja.nagare@uga.edu

import java.util.LinkedList;

public class Queue_basic {

	LinkedList queue;
	
//	constructor :  making a queue instance
	public Queue_basic() {
		queue = new LinkedList();
	}
	
//	is our queue empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
//	what is the size of our queue?
	public int size() {
		return queue.size();
	}
	
//	enqueue an item to the queue
	public void enqueue(int n) {
		queue.addLast(n);
	}
	
//	dequeue an item from the queue
	public int dequeue() {
		return (int) queue.remove(0);
	}
	 
//	peek at the first item
	public int peek() {
		 return (int) queue.get(0);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_basic numberQueue = new Queue_basic();
		numberQueue.enqueue(5);
		numberQueue.enqueue(7);
		numberQueue.enqueue(6);
		System.out.println("1st out " + numberQueue.dequeue());
		System.out.println("peek at  2nd item " + numberQueue.peek());		
		System.out.println("2nd out " + numberQueue.dequeue());		
		System.out.println("3rd out  " + numberQueue.dequeue());		 
		 

	}

}
