package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.Stack;
import my.study.ds.list.StackEmptyException;
import my.study.ds.list.StackOverFLowException;

public class StockSpanProblem {
	private Stack stockStack;
	private Stack stack;
	
	public StockSpanProblem(int size) {
		stockStack = new Stack(size);
		stack = new Stack(size);
	}
	
	public void scanStock(int element) throws StackOverFLowException, StackEmptyException {
		int count = 1;
		if(stockStack.isEmpty()) {
			stockStack.push(element);
			System.out.println(1);
			stack.push(1);
			return;
		}
		else {
			while(!stockStack.isEmpty()) {
				if(element>=stockStack.topELement()) {
					stockStack.pop();
					count+=stack.pop();
				}
				else break;
			}
		}
		stockStack.push(element);
		stack.push(count);
		System.out.println(count);
	}
}