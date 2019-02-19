package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.Stack;
import my.study.ds.list.StackEmptyException;
import my.study.ds.list.StackOverFLowException;

public class StackReverseUsingRecursion {
	public Stack stack;
	
	public StackReverseUsingRecursion(int size) {
		stack = new Stack(size);
	}
	
	public void reverse(int size) throws StackEmptyException, StackOverFLowException {
		int index = stack.TOP(); 
		
		int x = stack.pop();
		
		int y=-1;
		
		if(stack.TOP()>=size/2) {
			y =insert_Bottom(x,index,size);
			reverse(size);
			stack.push(y);
		}
		else stack.push(x);
	}

	private int insert_Bottom(int x,int index,int size) throws StackEmptyException, StackOverFLowException {
		int a = stack.pop();
		
		if(stack.TOP() == (size - index -2)) {
			stack.push(x);
			return a;
		}
		int z = insert_Bottom(x,index,size);
		stack.push(a);
		return z;
	}
}
