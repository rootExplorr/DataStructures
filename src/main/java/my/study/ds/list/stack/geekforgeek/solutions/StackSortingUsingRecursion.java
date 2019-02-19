package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.Stack;
import my.study.ds.list.StackEmptyException;
import my.study.ds.list.StackOverFLowException;

public class StackSortingUsingRecursion {
	private Stack stack;
	
	public StackSortingUsingRecursion(Stack stack) {
		this.stack = stack;
	}
	
	public void sort() throws StackEmptyException, StackOverFLowException {
		int min = stack.pop();

		min = findMin(min);
		if(!stack.isEmpty())
		  sort();
		stack.push(min);
	}

	private int findMin(int min) throws StackOverFLowException, StackEmptyException {
		if(stack.isEmpty())
			return min;
		int currentTop = stack.pop(),temp;
		
        if(min<currentTop) {
        	temp = min;
        	min = currentTop;
        	currentTop = temp;
		}
		min = findMin(min);
		stack.push(currentTop);
		return min;
	}
	
	public void print() {
		stack.print();
	}
}
