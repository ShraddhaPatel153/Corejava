package in.co.oop;

public class ShapeTest {
	
	public static void main(String [] args) {
		
		Shape s=new Shape();
		s.setColor("red");
		s.getColor();
		System.out.println(s.getColor());
		
		s.setBorder(10);
		s.getBorder();
		System.out.println(s.getBorder());
	}

}
