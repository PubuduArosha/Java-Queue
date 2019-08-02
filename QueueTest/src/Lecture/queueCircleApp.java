package Lecture;

public class queueCircleApp {

	public static void main(String[] args) {
		
		queueCircleX qc = new queueCircleX(10);

		
		qc.insert(10);
		qc.insert(25);
		qc.insert(55);
		qc.insert(65);
		qc.insert(85);
		
		while ( !qc.isEmpty()) {
			int val = qc.remove();
			System.out.println( val + "  " );
			
		}
	}

}
