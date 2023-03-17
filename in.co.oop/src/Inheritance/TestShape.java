package Inheritance;

public class TestShape {
	
	public static void main(String [] args) {
		
		Shape  s=new Shape ();
		
		s.setColor("Green");
		s.getColor();
		System.out.println(s.getColor());
		s.setBorderWidth(10);
		s.getBorderWidth();
		System.out.println(s.getBorderWidth());
	}

}
