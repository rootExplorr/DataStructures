package my.study.ds.list;

public class Stack {
	private int[] stack;
	private int TOP=-1;
	
	public Stack(int size) {
		stack=new int[size];		
	}
	
	public void push(int element) throws StackOverFLowException{		
		stack[++TOP] = element;
	}
	
	public int pop() throws StackEmptyException{
		if(TOP ==-1) 
			throw new StackEmptyException();
		int poppedElement = stack[TOP--];
		return poppedElement;
	}
	
	public int TOP() {
		return TOP;		
	}
	
	public boolean isEmpty() {
		return (TOP==-1?true:false);
	}
	
	public boolean isFull() {
		if(TOP==stack.length)
			return true;
		else return false;
	}
	
	public int topELement() {
		if(TOP==-1)
			return TOP;
		return stack[TOP];
	}
	
	public int size() {
		return TOP+1;
	}
	
	public void print() {
		for(int i=0;i<=TOP-1;i++) {
			System.out.print(stack[i]+",");			
		}
		System.out.println(stack[TOP]);
	}
	
	public void sort() throws StackOverFLowException, StackEmptyException {
		Stack anotherStack = new Stack(stack.length);
		int size = size();
		for(int i=0;i<size;i++) {
			int minElement = findMin(anotherStack,i);
			push(minElement);
			populate(anotherStack,minElement);
			print();
		}
	}

	private void populate(Stack anotherStack,int min) throws StackOverFLowException, StackEmptyException {
		int poppedElement;
		while(!anotherStack.isEmpty()) {
			if((poppedElement=anotherStack.pop())!=min)
			   push(poppedElement);
		}
	}

	private int findMin(Stack anotherStack ,int limit) throws StackEmptyException, StackOverFLowException {
		int min = pop(), poppedElement;
		anotherStack.push(min);
		while(TOP()!=(limit-1)) {
			if(min  > (poppedElement = pop()))
				min = poppedElement;
			anotherStack.push(poppedElement);
		}
		return min;
	}
}