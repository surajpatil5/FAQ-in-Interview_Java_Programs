
public class Reverse_String {

	public static void main(String[] args) {
		
		String S = "Welcome";
		int a = S.length();
		String rev ="";
		String rev1 ="";
		
		//I have defined 4 ways you can reverse a string value
		
		//Approach 1 - Using for loop
		
		for(int i = 0; i<a; i++)
		{
			char val = S.charAt(i);
			rev = val+rev;
		}
		System.out.println("The reverse of above string is: "+rev);
		//Output - The reverse of above string is: emocleW
		
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		
		//Approach 2 - Using for loop
		for(int i = S.length()-1; i>=0; i--)
		{
			char val = S.charAt(i);
			rev1=rev1+val;
		}
		System.out.println("The reverse of above string is: "+rev);
		//Output - The reverse of above string is: emocleW
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		//Approach 2 - Using StringBuffer & StringBuilder Class
		StringBuffer Sb = new StringBuffer(S);
		System.out.println(Sb.reverse());			//emocleW
		
		
		//Approach 3 - Using StringBuffer & StringBuilder Class
		StringBuilder Sb1 = new StringBuilder(S);
		System.out.println(Sb1.reverse());			//emocleW
		
	}

}
