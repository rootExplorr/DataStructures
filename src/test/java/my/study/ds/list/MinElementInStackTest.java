package my.study.ds.list;

import org.junit.Test;

import my.study.ds.list.stack.geekforgeek.solutions.MinElementInStack;

public class MinElementInStackTest {
	@Test
	public void test() throws StackOverFLowException, StackEmptyException {
		MinElementInStack stack = new MinElementInStack(5);
		
		System.out.println("PUshing elements to Stack");
		
		stack.push(5);
		stack.push(9);
		stack.push(2);
		stack.push(4);
		
		System.out.println("Current MInimum element in the STack is :" + stack.getMin());
		System.out.println("Popping off 2 elements...");
		
		stack.pop();
		stack.pop();
		
		System.out.println("Current MInimum element in the STack is :" + stack.getMin());
	}
}