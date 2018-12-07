package my.study.ds.list.stack.geekforgeek.solutions;

public class TwoStackSpaceEfficient {
	private int twoStack[];
	private int frontTop;
	private int backTop;	
	
	public TwoStackSpaceEfficient(int totalSize) {
		twoStack = new int[totalSize];
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
		if(frontTop+1==backTop)
			return true;
		else return false;
	}
	
	public boolean isFullTwo() {
		if(frontTop+1==backTop)
			return true;
		else return false;
	}
	
	public boolean pushOne(int element) {
		if(isFullOne()) {
			System.out.println("Stack One is full.");
			return false;
		}		
		else if(isEmptyOne()) {
			frontTop = 0;
		}
		twoStack[frontTop++] = element;
		return true;
	}
	
	public boolean pushTwo(int element) {
		if(isFullTwo()) {
			System.out.println("Stack Two is full");
			return false;
		}
		else if(isEmptyTwo()) {
			backTop = twoStack.length-1;
		}
		
		twoStack[backTop--] = element;
		return true;
	}	
}
