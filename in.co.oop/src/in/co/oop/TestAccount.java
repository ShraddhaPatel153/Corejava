package in.co.oop;

public class TestAccount {
	
	public static void main(String [] args) {
		
		Account a=new Account();
		
	a.SetNumber("23456867854");
	System.out.println(a.getNumber());
	
	a.SetAccount("Saving account");
	System.out.println(a.getaccount());
	
	a.Setbalance(2456.55);
	System.out.println(a.getbalance());
	
	a.SetDeposite(600);
	System.out.println(a.getDeposite());
	
	a.SetWithdrawal(55);
	System.out.println(a.getwithrawal());
	
	a.SetfundTransfer(4);
	System.out.println(a.getfundTransfer());
	}

}
