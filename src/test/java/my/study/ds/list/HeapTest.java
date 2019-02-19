package my.study.ds.list;

import static org.junit.Assert.*;

import org.junit.Test;

import my.study.ds.list.stack.geekforgeek.solutions.Heap;

public class HeapTest {

	@Test
	public void test() {
		Heap heap;
		heap = new Heap(new int [] {16,4,10,14,7,9,3,2,8,1});
		
		heap.buildMaxHeap();
		
	}

}
