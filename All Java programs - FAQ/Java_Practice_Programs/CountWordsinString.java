
public class CountWordsinString {

	public static void main(String[] args) {
		
		String S = "See you again my fellas";
		int count=0;
		String []wordcount = S.split(" ");
		
		for(String a:wordcount)
		{
			System.out.println(a);
			count++;
		}
		
		System.out.println("The word count in string array above is : "+count);

	}

}
