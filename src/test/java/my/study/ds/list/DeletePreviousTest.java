package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeletePreviousTest {

	@Test
	public void test() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insert(23);
		list.insert(45);
		list.insert(11);
		list.insert(77);
		list.insert(18);
		
		list.print();
		
		System.out.println();
		
		DoublePointerNode node = new DoublePointerNode(),temp;
		node = list.HEAD();
		int nodeValue;
		while(node!=null) {
			temp = node;
			node=node.getNext();
			nodeValue=node.getData();
			if(temp.getData()<nodeValue) {
				while(temp!=null && temp.getData()<nodeValue) {
					temp = list.delete(temp);										
				}
			}
			list.print();
			System.out.println();
		}
		list.print();
	}
}
