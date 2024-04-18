
public class ReverseLengthyString_using_4_ways {

	public static void main(String[] args) {
		
//		String S = "Welcome to Java Programming Guys";
//		String reverse ="";
//		//Using for loop + String In-built methods
//		for(int i=S.length()-1;i>=0;i--)
//		{
//			char A = S.charAt(i);
//			reverse = reverse + A;
//		}
//		System.out.println(reverse);			//syuG gnimmargorP avaJ ot emocleW
		
		
		//Using for loop + Without String In-built methods
//		String S = "Welcome to Java Programming Guys";
//		char[] ch = S.toCharArray();
//		
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			char A=ch[i];
//			System.out.print(A);
//		}
		//Output -> syuG gnimmargorP avaJ ot emocleW

		
		
		//Using StringBuffer
		String S = "Madam";
		StringBuffer S1 = new StringBuffer(S);
		StringBuffer rev = S1.reverse();
		System.out.println(rev);				//syuG gnimmargorP avaJ ot emocleW
		
		//To convert StringBuffer to String
		String N = rev.toString();
		System.out.println(N);  			//syuG gnimmargorP avaJ ot emocleW
		
		
		if(N.equalsIgnoreCase(N))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
		
		//Output -> The given string is not palindrome

	}

}
