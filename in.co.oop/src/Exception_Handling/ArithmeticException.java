package Exception_Handling;

public class ArithmeticException{
	
public static void main(String[] args) { 
	
	int a=20;
	int b=0;
	
	System.out.println("Before Exception");
	try {
		int c=a/b;
		
		System.out.println("Division="+c);
		
	} catch (Exception e) {
		System.out.println();
	}
	
}
