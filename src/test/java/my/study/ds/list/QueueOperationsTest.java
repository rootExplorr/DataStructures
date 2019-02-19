package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueOperationsTest {

	@Test
	public void interLeaveQueue() throws StackOverFLowException, StackEmptyException {
		Queue queue = new Queue(10);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		
		Stack stack = new Stack(5);
		
		for (int i = 0; i < 5; i++) {
			stack.push(queue.deQueue());
		}
		
		for (int i = 0; i < 5; i++) {
			queue.enqueue(stack.pop());
		}
		
		for (int i = 0; i < 5; i++) {
			queue.enqueue(queue.deQueue());
		}
		
		for (int i = 0; i < 5; i++) {
			stack.push(queue.deQueue());
		}
		
		for (int i = 0; i < 5; i++) {
			queue.enqueue(stack.pop());
			queue.enqueue(queue.deQueue());
		}
		
		queue.printQueue();
	}
	
	@Test
	public void sortQueueWithoutUsingExtraSpace() {
		Queue queue = new Queue(100);
		queue.enqueue(5);
		queue.enqueue(1);
		queue.enqueue(6);
		queue.enqueue(4);
		queue.enqueue(2);
		queue.enqueue(8);
		
		System.out.println("SIze of queue is : " + queue.size());
		System.out.println();
		System.out.println("Queue before sorting....");
		System.out.println();
		queue.printQueue();
		System.out.println();
		
		int smallest = 100,value;
		int count=0;
		for (int i = 0; i < 6; i++) {
			for (int x = 0; x < 6; x++) {
				value = queue.deQueue();
				if(x<=5-count && value<smallest)
					smallest = value;
				queue.enqueue(value);
			}
			
			for (int x = 0; x < 6; x++) {
				value = queue.deQueue();
				if(value==smallest)
					continue;
				queue.enqueue(value);
			}
			queue.enqueue(smallest);
			smallest = 100;
			count++;
		}
		System.out.println();
		System.out.println("Queue after sorting....");
		System.out.println();
		queue.printQueue();	
	}
}