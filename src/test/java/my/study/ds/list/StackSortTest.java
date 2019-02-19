package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackSortTest {

	@Test
	public void test() throws StackOverFLowException, StackEmptyException {
		Stack stack = new Stack(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		
		stack.print();
		
		stack.sort();
		
		stack.print();
	}

}
