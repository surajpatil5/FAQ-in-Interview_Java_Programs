
public class Palindrome_Num {

	public static void main(String[] args) {
		
		//int a = 1234;						//Output - The given string is not palindrome
		int a = 121;						//Output - The given string is palindrome
		
		//Using StringBuilder
		StringBuilder num = new StringBuilder(String.valueOf(a));
		StringBuilder rev = num.reverse();
		int b = Integer.parseInt(rev.toString());
		
		if(a==b)
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}

		
	}

}
