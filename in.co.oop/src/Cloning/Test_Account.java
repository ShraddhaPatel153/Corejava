package Cloning;

public class Test_Account {
	Account a1=new Account();
	public static void main(String [] args) throws CloneNotSupportedException {
		
		Account a1=new Account();	
		
a1.setBalance(10);
	
	//Account a2=new Account();
	
	Account a2=(Account)a1.clone();		
	a2.setBalance(20);
	System.out.println(a1.getBalance());
	
	System.out.println(a2.getBalance());
	
}

}


