package Override;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public  void setLength(int a) {
		length=a;
	}
	public double getLength(){
		return length;
	}
	public void setWidth(int b) {
		width=b;
	}
	public double getWidth() {
	return width;	
	}
	public double rArea() {
		double rArea=length*width;
		System.out.println(rArea);
		return rArea;
	}
}
