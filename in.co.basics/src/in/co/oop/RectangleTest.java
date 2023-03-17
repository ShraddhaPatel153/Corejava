package in.co.oop;

public class RectangleTest {
	
	public static void main(String [] args) {
		
		 Rectangle r = new Rectangle ();
		r.setLength(20);
		System.out.println(r.getLength());
		r.setWidth(10);
		System.out.println(r.getWidth());
		
		r.rArea();
	
	}

}
