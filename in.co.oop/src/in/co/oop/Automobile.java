package in.co.oop;

public class Automobile {
	
	private String color;
	private int speed = 0;
	private String make;
	private int changeGear;
	
	public void Setcolor(String a) {
		color=a;
	}
	public String getcolor() {
		return color;
	}
	public void Setspeed(int b) {
	speed=b;
	}
	public int getspeed() {
		return speed;
		
	}
	public void Setmake(String c) {
		make=c;
	}
	public String getmake() {
		return make;
	}
	public void SetChangeGear(int d) {
		changeGear=d;
	}
	public int getchangeGear() {
		return changeGear;
	}

}
