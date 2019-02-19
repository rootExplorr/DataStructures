package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

import my.study.ds.list.stack.geekforgeek.solutions.QueueUsingStack;

public class QueueUsingStackTest {

	@Test
	public void test() throws StackOverFLowException, StackEmptyException {
		QueueUsingStack queue = new QueueUsingStack(5);
		
        System.out.println("----This is a test to showcase the implementation of Queue using 2 stacks..----");
		
		System.out.println("Enqueing 1,2,3 into the queue.");
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		
		System.out.print("State of queue: ");
		queue.printQueue();
		
		System.out.println();
				
		System.out.println("Popping off 2 elements from the queue.");		
		
		queue.deQueue();
		queue.deQueue();
				
		System.out.println("State of queue: ");
		queue.printQueue();
	
	}

}
