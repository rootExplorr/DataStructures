package my.study.ds.list;

public class Queue {
	private int[] queue;
	private int HEAD=-1;
	private int TAIL=-1;
	
	public Queue(int size) {
		// TODO Auto-generated constructor stub
		queue = new int[size];
	}
	
	public boolean isFUll() {
		if(HEAD==(TAIL+1%queue.length))
			return true;
		else return false;
	}
	public boolean isEmpty() {
		if(HEAD==-1 && TAIL==-1)
			return true;
		else return false;
	}
	
	public boolean enqueue(int element) {		
		if(isFUll())
			{
			  System.err.println("Queue is full.");
			  return false;
			}
		
		if(isEmpty())
			HEAD++;
		
		if((TAIL+1)%queue.length==0)
			TAIL = 0;
		else TAIL++;
		
		queue[TAIL]=element;
		return true;
	}
	
	public int deQueue() {
		int poppedELement=queue[HEAD];
		queue[HEAD]=0;
		
		//If this is the last element left in the Queue.
		if(HEAD==TAIL) {
			HEAD=TAIL=-1;
		}
		else if ((HEAD+1)%queue.length==0) {
			HEAD=0;
		}
		else HEAD++;		
		
		return poppedELement;
	}
	
	public int HEAD() {
		return HEAD;
	}
	
	public int TAIL() {
		return TAIL;
	}
	
	public void printQueue() {
		int i=0;
		while(i<=TAIL) {
			System.out.print(queue[i++]);
		}
	}
	public String toString() {
		String queue="";
		for (int i = HEAD; i <= TAIL; i++) {
			queue+=this.queue[i]+",";
		}
		return queue.substring(0,queue.length()-1);
	}
}