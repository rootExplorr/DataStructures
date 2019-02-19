package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

import my.study.ds.list.stack.geekforgeek.solutions.StackReverseUsingRecursion;

public class StackUsingRecursionTest {

	@Test
	public void test() throws StackOverFLowException, StackEmptyException {
		StackReverseUsingRecursion stack = new StackReverseUsingRecursion(10);
		
		stack.stack.push(1);
		stack.stack.push(2);
		stack.stack.push(3);
		stack.stack.push(4);
		/*stack.stack.push(4);
		stack.stack.push(4);*/
		/*stack.stack.push(51);
		stack.stack.push(52);*/
		
				
		
		
		
		stack.reverse(stack.stack.size());
		
		stack.stack.print();
		
	}

}
