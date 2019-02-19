package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.Stack;
import my.study.ds.list.StackEmptyException;
import my.study.ds.list.StackOverFLowException;

public class MinElementInStack {
	private Stack stack;
	private int [] minValue;
	
	public MinElementInStack(int size) {
		stack = new Stack(size);
		minValue = new int[size];
	}
	
	public void push(int element) throws StackOverFLowException {
		int min;
		
		if(stack.isEmpty() || element <= minValue[stack.TOP()]) {
			min = element;
		}
		else min = minValue[stack.TOP()];
		
		stack.push(element);
		minValue[stack.TOP()] = min;
	}
	
	public int getMin() {
		return minValue[stack.TOP()];
	}
	
	public void pop() throws StackEmptyException {
		stack.pop();
	}
}