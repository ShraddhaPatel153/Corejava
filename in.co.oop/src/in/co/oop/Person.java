package in.co.oop;

import java.util.Date;

public class Person {
	
	private String Name;
	private Date dob;
	private String address;
	
	public void SetName(String c) {
		Name=c;
	}
	public String getName() {
		return Name;
	}
	
	public  void Setdob(Date b) {
		dob=b;
	}
	public Date getdob() {
		return dob;
	}
	public void Setaddress(String a) {
		address=a;
	}
	public String getaddress() {
		return address;
	}

}
