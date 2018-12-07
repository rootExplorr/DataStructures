package my.study.ds.list;

public class DoublePointerNode {
	private int data;
	private DoublePointerNode next;
	private DoublePointerNode previous;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublePointerNode getNext() {
		return next;
	}
	public void setNext(DoublePointerNode next) {
		this.next = next;
	}
	public DoublePointerNode getPrevious() {
		return previous;
	}
	public void setPrevious(DoublePointerNode previous) {
		this.previous = previous;
	}
}
