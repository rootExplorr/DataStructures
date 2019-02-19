package my.study.ds.list;

public class DoublyLinkedList {
	
	private DoublePointerNode HEAD;
	private DoublePointerNode FRONT;
	
	public boolean isEmpty() {
		if(HEAD==null && FRONT==null)
			return true;
		else return false;
	}
	
	public void insert(int element) {
		if(isEmpty()) {
			FRONT = new DoublePointerNode();
			HEAD = FRONT;
		}
		else {
			DoublePointerNode node = new DoublePointerNode();
			node.setPrevious(FRONT);
			FRONT.setNext(node);
			FRONT = node;
		}
		
		FRONT.setData(element);
	}
	
	public int delete() {
		if(isEmpty()) {
			System.err.println("List is empty!!");
		    return -1;
		}
	    
	DoublePointerNode traveller = HEAD;
	DoublePointerNode deleted;
	    while(traveller.getNext().getNext()==null) {
	    	traveller = traveller.getNext();
	}
	    deleted = traveller.getNext();
	    traveller.setNext(null);
	    return deleted.getData();
  }
	
	public DoublePointerNode HEAD() {
		return HEAD;
	}
	
	public DoublePointerNode FRONT() {
		return FRONT;
	}

	public DoublePointerNode delete(DoublePointerNode temp) {
		DoublePointerNode node = temp.getPrevious();		
		temp.getNext().setPrevious(node);
		
		if(HEAD()==temp)
			this.HEAD = temp.getNext();
		else node.setNext(temp.getNext());
		
		return node;
	}
	
	public void print() {
		DoublePointerNode node = HEAD();
		while(node.getNext()!=null) {
			System.out.print(node.getData()+",");
			node=node.getNext();
		}
		System.out.print(node.getData());
	}
	
}