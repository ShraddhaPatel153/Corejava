package Override;

public class TestShape {

public static void main(String [] args) {
	
	Rectangle r=new Rectangle();
	
	Shape  s=new Shape ();
	
	Shape s1=new Rectangle();
	
	Rectangle r1=(Rectangle)s1;
	r1.setLength(100);
	Rectangle r2=(Rectangle)s1;
	r2.setWidth(50);
	s1.rArea();
	
	Shape s2=new Circle();
	Circle c1=(Circle)s2;
	c1.setRadius(20);
	s2.rArea();
	
	Shape s3=new Triangle();
	Triangle t1=(Triangle)s3;
	t1.setBase(30);
	Triangle t2=(Triangle)s3;
	t2.setHight(20);
	s3.rArea();
	
	/*s.setColor("Green");
	s.getColor();
	System.out.println(s.getColor());
	s.setBorderWidth(10);
	s.getBorderWidth();
	System.out.println(s.getBorderWidth());*/
}

}