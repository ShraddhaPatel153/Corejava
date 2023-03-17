package in.co.oop;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;
	private int deposite;
	private int withrawal;
	private int fundTransfer;
	
	public void SetNumber(String a){
		number=a;
	}
	public String getNumber() {
		return number;
	}
	public void SetAccount(String b) {
		accountType=b;
	}
	public String getaccount() {
		return accountType;
	}
	public void Setbalance(double c) {
		balance=c;
	}
	public double getbalance() {
		return balance;
	}
	public void SetDeposite(int d) {
		deposite=d;
	}
	public int getDeposite() {
		return deposite;
		
	}
	public void SetWithdrawal(int e) {
		withrawal=e;
	}
	public int getwithrawal() {
		return withrawal;
	}
	public void SetfundTransfer(int f) {
		fundTransfer=f;
	}

 public	int getfundTransfer() {
	 return fundTransfer;
 }
	
	}
