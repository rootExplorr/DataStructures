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
}