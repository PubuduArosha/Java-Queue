package Lecture;

public class queueX {
	
	private int maxSize; //size of queue array
	private int[] queArray;
	private int front; //front of the queue
	private int rear; //rear of the queue
	private int nItems; //no of items of the queue
	
	//constructor
	public queueX( int s ) {
		maxSize = s; //set array size
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert ( int k ) {
		if ( nItems == maxSize-1 )
			System.out.println("Queue is full");
		else {
			queArray[++rear] = k;
			nItems++;	
		}
	}
	
	public int remove() {
		if( nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			nItems--;
			return queArray[front++];
		}	
	}
	
	public int peekFront() {
		if( nItems == 0 ) {
			System.out.println("Queue is empty");
			return -99;
		}
		else 
			return queArray[front];
	}
	
	public boolean isEmpty() {
		if ( nItems == 0 )
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if ( nItems == maxSize - 1 )
			return true;
		else
			return false;
	}
	
}
