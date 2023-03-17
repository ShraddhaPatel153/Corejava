package Exception_Handling;

public class Try_Without_Catch {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		System.out.println("Before Exception");
		
		try {
			int c=a/b;
			System.out.println("Divisoin="+c);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		System.out.println("After Exception");
		
	}

}
