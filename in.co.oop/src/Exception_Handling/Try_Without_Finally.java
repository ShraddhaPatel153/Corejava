package Exception_Handling;

public class Try_Without_Finally {

public static void main(String[] args) { 
	
	int a=20;
	int b=0;
	
	System.out.println("Before Exception");
	try {
		int c=a/b;
	} catch (Exception e) {
		
	}
	System.out.println("After Exception");
}

}
