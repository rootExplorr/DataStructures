package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

import my.study.ds.list.stack.geekforgeek.solutions.StackSortingUsingRecursion;

public class StackSortingUsingRecursionTest {

	@Test
	public void test() throws StackOverFLowException, StackEmptyException {
		Stack stack = new Stack(10);
		stack.push(10);
		stack.push(2);
		stack.push(15);
		stack.push(120);
		stack.push(45);
		stack.push(1);
		stack.push(6);
		stack.push(9);
		stack.push(23);
		
		StackSortingUsingRecursion test = new StackSortingUsingRecursion(stack);
		System.out.println("---------Stack before Sorting-----------");
		
		test.print();
		
		test.sort();
		
		System.out.println("---------Stack after Sorting-----------");
		
		test.print();
	}
}
