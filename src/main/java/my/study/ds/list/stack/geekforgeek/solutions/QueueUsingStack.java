package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.StackTest;
import my.study.ds.list.Stack;
import my.study.ds.list.StackEmptyException;
import my.study.ds.list.StackOverFLowException;

public class QueueUsingStack {
	private Stack insertStack;
	private Stack deleteStack;
	
	public QueueUsingStack(int size) {
		insertStack = new Stack(size);
		deleteStack = new Stack(size);
	}
	
	public boolean isEmpty() {
		if(insertStack.isEmpty())
			return true;
		else return false;
	}
	
	public boolean enQueue(int element) {
		try {
			insertStack.push(element);
		} catch (StackOverFLowException e) {
			return false;
		}
		return true;
	}
	
	private boolean altEnQueue(int element) throws StackOverFLowException, StackEmptyException {
		if(deleteStack.isEmpty()) {
			//Pop all elements from insert Stack and push them into delete stack.
			while(!insertStack.isEmpty()) {
				deleteStack.push(insertStack.pop());
			   }
			}
		try {
			insertStack.push(element);
			return true;
		} catch (StackOverFLowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private int altDequeue() throws StackEmptyException {
		return deleteStack.pop();
	}
	
	public int deQueue() throws StackOverFLowException, StackEmptyException {
		if(deleteStack.isEmpty()) {
		//Pop all elements from insert Stack and push them into delete stack.
		while(!insertStack.isEmpty()) {
			deleteStack.push(insertStack.pop());
		   }
		}
		int deletedElement;
		
		//Keeping the deleted element.
		deletedElement = deleteStack.pop();		

		return deletedElement;
	}
}