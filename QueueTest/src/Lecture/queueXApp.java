package Lecture;

public class queueXApp {

	public static void main(String[] args) {
		
		queueX qx = new queueX(5);
		
		qx.insert(5);
		qx.insert(4);
		qx.insert(9);
		qx.insert(7);
		qx.insert(15);
		
		while (! qx.isEmpty() ) {
			int val = qx.remove();
			System.out.println( val );
				
		}

	}

}
