package ConsTructor_Array_poly;

public class RectangleP extends ShapeP {
	private int length=0;
	private int width=0;
	
	public  RectangleP() {
		
	}
	public RectangleP(int a,int b){
		 length=a;
		 width=b;
	}
	public void setWidth(int b) {
		width=b;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
	return width;	
	}
	public double rArea() {
		int Area=length*width;
		System.out.println(Area);
		return Area;
	}
}
