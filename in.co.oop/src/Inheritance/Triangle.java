package Inheritance;

public class Triangle extends Shape {
	
	private int base;
	private int hight;
	
	public void setBase(int b) {
		base=b;
	}
	public int getBase() {
		return base;
	}
	public void setHight(int h) {
		hight=h;
	}
	public int getHight() {
		return hight;
	}
	public void rArea() {
		double rArea=base*hight/2;
		System.out.println(rArea);
	}

}
