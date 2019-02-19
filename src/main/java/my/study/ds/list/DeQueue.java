package my.study.ds.list;

public class DeQueue {
	private int[] queue;
	private int HEAD=-1;
	private int TAIL=-1;
	
	public DeQueue(int size) {
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
	
	public boolean insertFront(int element) {		
		if(isFUll())
			{
			  System.err.println("Queue is full.");
			  return false;
			}
		
		if(isEmpty())
			HEAD=TAIL=0;
		if(HEAD == 0)
			HEAD = queue.length-1;
		queue[HEAD]=element;	
		return true;
	}
	
	public void insertRear(int element) throws QueueOverFlowException {
		if(isFUll())
			throw new QueueOverFlowException();
		
		if(isEmpty())
			HEAD=TAIL=0;
		
		if(TAIL==queue.length-1)
		    TAIL = 0;
		
		queue[TAIL] = element;		
	}
	
	public int removeRear() {
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