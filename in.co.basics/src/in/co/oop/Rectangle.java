package in.co.oop;

public class Rectangle {
	
	private int Length;
	private int Width;
	
	public void setLength(int a) {
		Length=a;
	}
	public int getLength() {
		return Length;
	}
	public void setWidth(int b) {
		Width=b;
	}
	public int getWidth() {
		return Width;
		
	}
	public void rArea() {
		double rArea=Length*Width;
		System.out.println(rArea);
	}

}
