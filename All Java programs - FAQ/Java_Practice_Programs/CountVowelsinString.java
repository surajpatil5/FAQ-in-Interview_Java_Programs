
public class CountVowelsinString {
	
	public static void main(String a[])
	{
		String S = "see you again my fellas";
		int count=0;
		
		for(int i=0; i<S.length();i++)
		{
			char ch = S.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		
		System.out.println("The vowels count in above string is: "+count);
		
		
		
	}

}
