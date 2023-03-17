package in.co.oop;

public class TestAutomobile {
	
	public static void main(String [] args) {
		
		Automobile a= new Automobile();
		
		a.Setcolor("pink");
		System.out.println(a.getcolor());
		
		a.Setspeed(20);
		System.out.println(a.getspeed());
		
		a.SetChangeGear(5);
		System.out.println(a.getchangeGear());
	}

}
