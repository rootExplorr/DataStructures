package my.study.ds.list.stack.geekforgeek.solutions;

public class Heap {
	private int[] array;
	
	public Heap(int[] array) {
		this.array = array;
	}
	
	private void maxHeapify(int index) {
		if(index>array.length-1)
			return;
		int left = index*2;
		int right = index*2+1;
		int temp;
		
		int largestIndex = index;
		
		if((left<=array.length-1 && right<= array.length-1) && array[left]>array[index] && array[left]>array[right]) {
			largestIndex = left;			
		}
		else if(array[right]>array[index] && array[right]>array[left]) {
			largestIndex = right;
		}	
		
		if(largestIndex!=index) {
			temp = array[largestIndex];
			array[index] = array[largestIndex];
			array[index] = temp;
			
			maxHeapify(largestIndex);
		}
	}
	
	public void buildMaxHeap() {
		for (int i = array.length/2; i >=1; i--) {
			maxHeapify(i);
			printHeap();
		}
	}
	
	public void printHeap() {		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}