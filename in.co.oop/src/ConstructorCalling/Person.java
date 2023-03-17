package ConstructorCalling;

public class Person {
	public String firstName=null;
	public String lastName=null;
	public String address=null;
	
public Person() {
	System.out.println("Person Default con");
}
public Person(String fn,String ln) {
	
	firstName=fn;
	lastName=ln;
	System.out.println("2 params constructer is called");
}
public Person(String fn,String ln,String address) {
	this(fn,ln);
	firstName=fn;
	lastName=ln;
	this.address=address;
	System.out.println("3 params constructor is called");
	
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getAddress() {
	return address;
}

}
