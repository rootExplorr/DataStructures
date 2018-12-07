package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.Queue;

public class StackUsingQueue {
	private Queue q1;
	private Queue q2;
	
	public StackUsingQueue(int size) {
		q1 = new Queue(size);
		q2 = new Queue(size);
	}
	
	public boolean push(int element) {
		return q1.enqueue(element);		
	}
	
	public int pop() {
		if(q1.isFUll()) {
			System.out.println("Stack is full");
			return -1;
		}
		
		//Copy elements.
		while(q1.HEAD()<q1.TAIL()) {
			q2.enqueue(q1.deQueue());
		}
		
		Queue temp = q1;
		q1 = q2;
		q2 = temp;		
		return q2.deQueue();
	}
	
	public boolean altPush(int element) {
		if(q1.isFUll()) {
			System.out.println("Stack is full");
			return false;
		}
		q2.enqueue(element);
		
		while(!q1.isEmpty()) {
			q2.enqueue(q1.deQueue());
		}
		
		Queue temp = q1;
		q1 = q2;
		q2 = temp;
		
		return true;
	}
	
	public int altPop() {
		return q1.deQueue();				
	}
	
	public void printStack() {
		q1.printQueue();
	}
}