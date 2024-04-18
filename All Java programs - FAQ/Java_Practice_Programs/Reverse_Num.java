
public class Reverse_Num {

	public static void main(String[] args) {

		int a = 23456;
		
		//I have defined 4 ways/approaches to print reverse number
		
		
		//Approach 1 - Using StringBuffer
		StringBuffer num1 = new StringBuffer(String.valueOf(a));
		StringBuffer rev1 = num1.reverse();
		System.out.println("The reverse value of given integer is: "+ rev1);			
		//Output = The reverse value of given integer is: 65432
		
		//To convert stringBuffer class value to int value
		int a1 = Integer.parseInt(rev1.toString());
		System.out.println("Convert value from StringBuffer to int: "+ a1);
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		

		//Approach 2 - Using StringBuilder
		StringBuilder num2 = new StringBuilder(String.valueOf(a));
		StringBuilder rev2 = num2.reverse();
		System.out.println("The reverse value of given integer is: "+ rev2);
		//Output = The reverse value of given integer is: 65432
		
		//To convert stringBuilder class value to int value
		int a2 = Integer.parseInt(rev2.toString());
		System.out.println("Convert value from StringBuilder to int: "+a2);
		
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		//Approach 3 - Convert int data type to String format & find out the reverse value
		String num3 = String.valueOf(a);
		System.out.println(num3.length());		//5 -> This is the length of number
		//I can reverse number using for loop
		String finalvalue = "";
		for(int i=0;i<num3.length();i++)
		{
			char val = num3.charAt(i);
			finalvalue=val+finalvalue;
		}
		System.out.println("The reverse value of string is: "+ finalvalue);
		//To convert String value to int, we use wrapper classs
		int rev = Integer.parseInt(finalvalue);
		System.out.println(rev);
		
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		
		//Approach 4 (Not recommended) - Convert String to char array & then using loop you can iterate each & every value in reverse order
		char[] ch=num3.toCharArray();
		
		for(int i=ch.length-1; i>=0;i--)
		{
			char b = ch[i];
			System.out.print(b);
		}
		System.out.println();		//65432
		
	}

}
