package Override;

public class Circle extends Shape{
	private double radius=0;
	public final double p=3.141;
	
	public void setRadius(int r) {
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
	
	public double rArea() {
		double rArea=p*(radius*radius);
		System.out.println(rArea);
		return rArea;
	}

}
