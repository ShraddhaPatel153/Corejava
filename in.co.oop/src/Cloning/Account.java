package Cloning;

public class Account {
	int balance=0;
	public void setBalance(int B) {
		this.balance=B;
	}
	public int getBalance() {
		return balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
}
