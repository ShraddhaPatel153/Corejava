package in.co.basics;

public class javalangs{

	public static void main(String[] args) {
		
		String name = "Shraddha Patel";
		
		String rev="";

		for (int i = name.length()-1; i >=0; i--) {
			
			rev=rev+name.charAt(i);

			System.out.println(rev);
			
		}
	}
}
