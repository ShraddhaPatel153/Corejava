package ConsTructor_Array_poly;

public class CircleP  extends ShapeP{
	private double radius=0;
	public final double p=3.141;
	
	public CircleP() {
		
	}
	
	public CircleP (double r) {
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
	
	public double Area() {
		double Area=p*(radius*radius);
		System.out.println(Area);
		return Area;
	}

}
