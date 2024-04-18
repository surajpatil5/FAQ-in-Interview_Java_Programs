
public class CountOccurenceOfChar_String {

	public static void main(String[] args) {
		
		String S = "Mahakal";
		char ch = 'a';
		int count=0;
		
		for(int i=0;i<S.length();i++)
		{
			char splchar =S.charAt(i);
			if(splchar==ch)
			{
				count++;
			}
		}
		
		System.out.println("The character "+ ch +" occur "+count+ " times");
		
		int actuallength =S.length();
		System.out.println("Before removing 'a' the count is: "+actuallength);

		int afterremovingchar = S.replace("a","").length();
		System.out.println("After removing 'a' the count is: "+afterremovingchar);
		
		
		
		
	}

}
