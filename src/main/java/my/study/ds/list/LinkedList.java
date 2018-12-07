package my.study.ds.list;

public class LinkedList {
	private Node HEAD;
	private Node LAST;
	private Node secondLast;
	
	public boolean isEmpty() {
		if(HEAD==null)
			return true;
		else return false;
	}
	
	public void insert(int element) {
		if(isEmpty()) {
			LAST = new Node();
			HEAD = LAST;
			secondLast = LAST;
		}
		else {
			LAST.setNext(new Node());
			secondLast = LAST;
			LAST = LAST.getNext();
		}
		
		LAST.setData(element);
	}
	
	public int delete() {
		if(isEmpty()) {
			System.err.println("List is empty!!");
		    return -1;
		}
	    
	Node traveller = HEAD;
	Node deleted;
	    while(traveller.getNext().getNext()==null) {
	    	traveller = traveller.getNext();
	}
	    deleted = traveller.getNext();
	    traveller.setNext(null);
	    return deleted.getData();
  }
}