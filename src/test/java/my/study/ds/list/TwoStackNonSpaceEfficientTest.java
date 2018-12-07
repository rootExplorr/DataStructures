package my.study.ds.list;

import my.study.ds.list.stack.geekforgeek.solutions.TwoStack;

public class TwoStackNonSpaceEfficientTest {
	public static void main(String[] args) {
	    System.out.println("----This showcases the implementation of 2 stacks using a single array.----");
		
	    TwoStack stack = new TwoStack(5,5);
	    
	    System.out.print("Initial State of Full Stack : ");
		stack.printFullStack();
		
        System.out.println("Pushing 1,2,3 into the stack One.");
		
		stack.pushOne(1);
		stack.pushOne(2);
		stack.pushOne(3);
		
		
		System.out.print("State of Stack One : ");
		stack.printOne();
		
		System.out.print("State of Full Stack : ");
		stack.printFullStack();
		
		//Pushing into Stack two.
		System.out.println("Pushing 5,6,7 into the Stack Two.");
		
		stack.pushTwo(5);
		stack.pushTwo(6);
		stack.pushTwo(7);
		
		System.out.print("State of Stack Two : ");
		stack.printTwo();
		
		System.out.print("State of Full Stack : ");
		stack.printFullStack();
				
		
		//Pop Stack One
		System.out.println("Popping off 2 elements from the stack one.");
		stack.popOne();
		stack.popOne();
				
		System.out.print("State of Stack one : ");
		stack.printOne();
		
		System.out.print("State of Full Stack : ");
		stack.printFullStack();
		
		//Stack Two		
		System.out.println("Popping off 2 elements from the Stack Two.");
		stack.popTwo();
		stack.popTwo();
				
		System.out.print("State of Stack two : ");
		stack.printTwo();
		
		System.out.print("State of Full Stack : ");
		stack.printFullStack();
		
	}
}
