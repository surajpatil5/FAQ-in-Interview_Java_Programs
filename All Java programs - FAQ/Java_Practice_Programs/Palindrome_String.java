
public class Palindrome_String {

	public static void main(String[] args) {
		
		//String S = "madam";							//Output - The given string is palindrome
		String S = "welcome";							//Output - The given string is not palindrome
		String rev="";
		
		
		//Approach 1 - Using for loop
		for(int i=S.length()-1;i>=0;i--)
		{
			char A = S.charAt(i);
			rev = rev+A;
		}
		System.out.println(rev);
		
		if(S.equals(rev))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
		
		
		
		//Approach 2 - Using StringBuffer Class
		StringBuffer bf = new StringBuffer(S);
		StringBuffer bfrev = bf.reverse();
		
		String A = String.valueOf(bfrev);
		System.out.println(A);

		if(A.equals(S))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
		
		
		
		
		
		
	}

}
