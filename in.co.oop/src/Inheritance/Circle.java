package Inheritance;

public class Circle extends Shape {
	
	private int radius=0;
	public final double p=3.141;
	
	public void setRadius(int r) {
		radius=r;
	}
	public int getRadius() {
		return radius;
	}
	
	public void rArea() {
		double rArea=p*(radius*radius);
		System.out.println(rArea);
	}
	

}
