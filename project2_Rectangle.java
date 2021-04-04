
public class Rectangle {
	
	double width;
	double height;
	
	Rectangle() {
		this(1.0, 1.0);
	}
	
	Rectangle(double x, double y) {
		this.width = x;
		this.height = y;	
	}
	
	
	void print() {
		System.out.println("width = " + width + ", height = " + height );		
	}
	
	boolean equal(Rectangle r) {
		if ( (this.width == r.width) && (this.height == r.height) ) {
			return true;
		} else {
			return false;
		}
	}
	
	double area() {
		return width*height;
	}
		
	
	double compare(Rectangle r) {
		return this.area() - r.area();
	}

		
	void resize(double ratio) {
		width *= ratio;
		height *= ratio;
	}
	
}