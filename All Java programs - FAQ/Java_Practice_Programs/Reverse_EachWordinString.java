
public class Reverse_EachWordinString {

	public static void main(String[] args) {
		
		//Approach 1
		/*
		String S = "Welcome to Java Programming";
		
		String str[] = S.split(" ");
		
		String revstring ="";
		
		for(String val:str)
		{
			String revword="";
			for(int i=val.length()-1;i>=0;i--)
			{
				revword=revword+val.charAt(i);
			}
			revstring=revstring+revword+" ";
		}
		
		System.out.println(revstring);
		*/
		
		
		//Approach 2
		String S = "Welcome to Java Programming";
		String str[] = S.split("\\s");
		
		String strrevstring = "";
		
		for(String val:str)
		{
			StringBuilder sb= new StringBuilder(val);
			sb.reverse();
			
			strrevstring=strrevstring+sb.toString()+" ";
		}
		System.out.println(strrevstring);

	}

}
