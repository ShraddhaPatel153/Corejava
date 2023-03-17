package Interface;

public class Businessman implements Richman,SocialWorker {
	
	private String Name;
	private String address;

	@Override
	public void earnMoney() {
		System.out.println(" Money");
		
	}

	@Override
	public void donation() {
		System.out.println("Giving donation");
	
	}

	@Override
	public void party() {
		System.out.println("Party");
		
		
	}

	@Override
	public void helpToOther() {
		System.out.println(" Helping others");
	
		
	}
	
	public void name() {
		System.out.println("Shraddha");
	}
	
	public void address() {
		System.out.println("Khargone");
	}

}
