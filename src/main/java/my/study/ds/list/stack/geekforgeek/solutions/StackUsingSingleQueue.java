package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.Queue;

public class StackUsingSingleQueue {
	private Queue queue;
	
	public StackUsingSingleQueue(int size) {
		queue = new Queue(size);
	}
	
	
	public void push(int element) {
		queue.enqueue(element);
		int size = queue.TAIL() - queue.HEAD(); 
		for(int i=0;i<=size-1;i++) {
			queue.enqueue(queue.deQueue());
		}
	}
	
	public int pop() {
		return queue.deQueue();
	}
	
	public void print() {
		System.out.println(queue);
	}
}
