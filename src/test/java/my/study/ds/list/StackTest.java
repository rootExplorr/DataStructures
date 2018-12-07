package my.study.ds.list;

import my.study.ds.list.stack.geekforgeek.solutions.StackUsingQueue;

public class StackTest {
	public static void main(String[] args) throws StackOverFLowException, StackEmptyException {
		System.out.println("----This is a test to showcase the implementation of basic Stacks----");
		
		Stack stack = new Stack(5);
		
		System.out.println("Pushing 1,2,3 into the stack.");
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.print("State of Stack: ");
		stack.print();
				
		System.out.println("Popping off 2 elements from the stack.");
		stack.pop();
		stack.pop();
				
		System.out.print("State of Stack: ");
		stack.print();	
	}
}
