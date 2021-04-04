
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.0, 1.0);
		Rectangle r2 = new Rectangle(2.0, 4.0);
		Rectangle r3 = new Rectangle(3.0, 3.0);
		
		if (r2.equal(r3) == true) {
			System.out.println("two rectangles are equal.");
		} else {
			System.out.println("two rectangles are different");
		}
		
		if ( r2.compare(r3) > 0 ) {
			System.out.println("r2 is larger than r3");
		} else if ( r2.compare(r3) < 0 ) {
			System.out.println("r2 is smaller than r3");
		} else {
			System.out.println("two are the same in area");
		}
		
		r1.print();
		r1.resize(3.5);
		r1.print();

	}

}
