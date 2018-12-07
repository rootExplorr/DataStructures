package my.study.ds.list;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import my.study.ds.list.stack.geekforgeek.solutions.StackUsingSingleQueue;

/**
 * Unit test for simple App.
 */
public class StackUsingSingleQueueTest{
	public static void main(String[] args) {
		
		StackUsingSingleQueue stack = new StackUsingSingleQueue(10);
		
		System.out.println("----This tests showcases the implementation of Stack using a Single Queue that is not space efficient----");
		
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
