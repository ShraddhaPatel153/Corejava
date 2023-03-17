package Override;

public class Triangle extends Shape {
	private double base;
	private double hight;
	
	public void setBase(int b) {
		base=b;
	}
	public double getBase() {
		return base;
	}
	public void setHight(int h) {
		hight=h;
	}
	public double getHight() {
		return hight;
	}
	public double rArea() {
		double rArea=base*hight/2;
		System.out.println(rArea);
		return rArea;
	}
}
