package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.StackTest;

public class TwoStack {
	private int twoStack[];
	private int frontSize;
	private int backSize;
	private int frontTop;
	private int backTop;	
	
	public TwoStack(int frontSize,int backSize) {
		twoStack = new int[frontSize+backSize];
		this.frontSize =frontSize;
		this.backSize = backSize;
		frontTop = backTop = -1;
	}
	
	public boolean isEmptyOne() {
		if(frontTop==-1)
			return true;
		else return false;
	}
	
	public boolean isEmptyTwo() {
		if(backTop==-1)
			return true;
		else return false;
	}
	
	public boolean isFullOne() {
		if(frontTop==frontSize-1)
			return true;
		else return false;
	}
	
	public boolean isFullTwo() {
		if(backTop==backSize-1)
			return true;
		else return false;
	}
	
	public boolean pushOne(int element) {
		if(isFullOne()) {
			System.out.println("Stack One is full.");
			return false;
		}
		
		twoStack[++frontTop] = element;
		return true;
	}
	
	public boolean pushTwo(int element) {
		if(isFullTwo()) {
			System.out.println("Stack Two is full");
			return false;
		}
		
		else if(isEmptyTwo()) {
			backTop = frontSize-1;
		}
		
		twoStack[++backTop] = element;
		return true;
	}
	
	public int popOne() {
		if(isEmptyOne())
			return -1;
		int poppedELement = twoStack[frontTop];
		twoStack[frontTop--] = 0;
		return poppedELement;
	}
	
	public int popTwo() {
		if(isEmptyTwo())
			return -1;
		int poppedELement = twoStack[backTop];
		twoStack[backTop--] = 0;
		return poppedELement;
	}
	
	public void printOne() {
		for (int j = 0; j <= frontSize-2; j++) {
			System.out.print(twoStack[j]+",");
		}
		System.out.println(twoStack[frontSize-1]);
	}
	
	public void printTwo() {
		for (int k = frontSize; k <= twoStack.length-2; k++) {
			System.out.print(twoStack[k]+",");
		}
		System.out.println(twoStack[twoStack.length-1]);
	}
	
	public void printFullStack() {
		for (int x = 0; x <= twoStack.length-2; x++) {
			System.out.print(twoStack[x]+",");
		}
		System.out.println(twoStack[twoStack.length-1]);
	}
}