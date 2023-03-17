package ConsTructor_Array_poly;

public class TriangleP extends ShapeP{
	private int base=0;
	private int hight=0;
	
	public TriangleP() {
		
	}
	
	public TriangleP(int b,int h) {
		base=b;
		hight=h;
	}
	public int getBase() {
		return base;
	}
	
	public int getHight() {
		return hight;
	}
	public double Area() {
		double Area=base*hight/2;
		System.out.println(Area);
		return Area;
	}
}
