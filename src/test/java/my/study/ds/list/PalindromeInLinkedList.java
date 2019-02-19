package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeInLinkedList {

	@Test
	public void test() {
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(2);
		list.insert(1);
		
		
		Node singleMover = list.HEAD();
		Node doubleMover = singleMover.getNext();
		
		StringBuffer str1 = new StringBuffer(), str2 = new StringBuffer();
		
		while(doubleMover!=null && doubleMover.getNext()!=null) {
			str1.append(singleMover.getData());
			singleMover = singleMover.getNext();
			doubleMover = doubleMover.getNext();
			if(doubleMover!=null)
				doubleMover = doubleMover.getNext();
	 }
		
		if(doubleMover!=null && doubleMover.getNext()==null) {
			str1.append(singleMover.getData());
		}
		singleMover = singleMover.getNext();
		
		while(singleMover != null) {
			str2.append(singleMover.getData());
			singleMover = singleMover.getNext();
		}
		
		if(str1.toString().equals(str2.reverse().toString()))
			System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
	}
}