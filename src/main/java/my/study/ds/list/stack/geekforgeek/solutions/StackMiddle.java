package my.study.ds.list.stack.geekforgeek.solutions;

import my.study.ds.list.DoublePointerNode;
import my.study.ds.list.DoublyLinkedList;

public class StackMiddle {
	private DoublyLinkedList list ;
	private DoublePointerNode midNode;
	private int count;
	
	public StackMiddle() {
		this.list = new DoublyLinkedList();
	}
	
	public void push(int element) {
		list.insert(element);
		count++;		

		if(list.HEAD().getNext()==list.FRONT().getNext()) {
			midNode = list.HEAD();
		}
		else if(count%2!=0)
			midNode = midNode.getNext();
	}
	
	public void pop() {
		if(list.isEmpty()) {
			System.out.println("Stack is empty.");
			return; 
		}
		
		list.delete();
		count--;
		
		if(count%2!=0)
			midNode = midNode.getPrevious();			
	}
}
