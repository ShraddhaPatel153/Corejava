package Exception_Handling;

public class Catch_Without_Try {

	public static void main(String[] args) {
		
	
	int a=10;
	int b=0;
	System.out.println("Before Exception");
	
	catch (Exception e) {
		
	
		int c=a/b;
		System.out.println("Divisoin="+c);
	}	
	} 
		
	

	System.out.println("After Exception");
	


}
