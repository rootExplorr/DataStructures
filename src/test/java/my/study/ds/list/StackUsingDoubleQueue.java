package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

import my.study.ds.list.stack.geekforgeek.solutions.StackUsingQueue;

public class StackUsingDoubleQueue {

	@Test
	public void test() {
		StackUsingQueue stack = new StackUsingQueue(5);
		
        System.out.println("----This is a test to showcase the implementation of Stacks using two queues.----");
		
		System.out.println("Pushing 1,2,3 into the stack.");
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.print("State of Stack: ");
		stack.printStack();
		System.out.println();
				
		System.out.println("Popping off 2 elements from the stack.");		
		
		stack.pop();
		stack.pop();
				
		System.out.println("State of Stack: ");		
		stack.printStack();
	}

}
