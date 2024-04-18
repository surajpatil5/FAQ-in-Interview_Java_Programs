import java.util.HashSet;

public class FindDuplicatesIn_Array {

	public static void main(String[] args) {

		String s[] = {"java","c","csharp","python","ruby"};
		
		
		//Approach 1 -> Find Duplicate element in an String Array
		/*boolean status=false;

		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equalsIgnoreCase(s[j]))   // If there is no value in uppercase then (s[i]==s[j]) will work
				{
					System.out.println("duplicate value is: "+s[i]+" & "+s[j]);
					status=true;
				}
			}
		}
		
		if(status==false)
		{
			System.out.println("There are no duplicate elements in an array");
		}
		*/
		
		
		//Approach 2 -> Using HashSet
		
		HashSet<String> value = new HashSet<String>();
		
		boolean status=false;
		
		for(String str:s)
		{
			//System.out.println(value.add(str)); // Will return false if there is any duplicate value
			
			if(value.add(str)==false)
			{
				System.out.println("Duplicate value is: "+str);
				status=true;										//If duplicate value present then it'll change the value of 'status' 
			}
		}
		
		if(status==false)
		{
			System.out.println("There are no duplicate elements in an array");  
		}

		
		
		
		
	}

}
