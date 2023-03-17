package ConsTructor_Array_poly;

public class ShapeP {
	
	private String color=null;
	private int borderWidth=0;
	
	public ShapeP() {
		
	}
	public ShapeP(String a,int b) {
		color=a;
		borderWidth=b;
	}
	public String getColor() {
		return color;
	}
	public int getBorderwidth() {
		return borderWidth;
	}
	public double Area() {
		System.out.println("r Area");
		return 0;
	}

}
