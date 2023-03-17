package Inheritance;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public  void setLength(int a) {
		length=a;
	}
	public int getLength(){
		return length;
	}
	public void setWidth(int b) {
		width=b;
	}
	public int getWidth() {
	return width;	
	}
	public int rArea() {
		int rArea=length*width;
		System.out.println(rArea);
		return rArea;
	}

}
