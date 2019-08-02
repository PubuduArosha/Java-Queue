package Lecture;

public class queueCircleX {
	
	int maxSize;
	int front;
	int rear;
	int nItems;
	int queCArray[];
	
	public queueCircleX( int n ) {
		maxSize = n;
		queCArray = new int[ maxSize ];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert( int k ) {
		if( nItems == maxSize )
			System.out.println("Queue is full");
		else {
			if ( rear == maxSize-1 )
				rear = -1;
			
			queCArray[++rear] = k;
			nItems++;
		}
	}
	
	public int remove() {
		if( nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			int temp = queCArray[front++];
			
					if( front == maxSize )
						front = 0;
			
			nItems--;
			return temp;
		}
	}
	
	public int peekFront() {
		return queCArray[front];
	}
	
	public boolean isEmpty() {
		return ( nItems == 0 );
	}

	public boolean isFull() {
		return ( nItems == maxSize );
	}
}
