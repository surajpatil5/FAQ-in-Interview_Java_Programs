
public class ExistenceOfvalue_inArray {

	public static void main(String[] args) {
		
		int arr[] = {22,34,56,77,88,98,45,65};
		int val = 88;
		
		
		//using enhanced for loop
		for(int num :arr)
		{
			if(num==val)
			{
				System.out.println("The value exist");
			}
		}
		
		
		//using for loop
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				System.out.println("The value: "+val +" exist in an given array");
			}
		}
		
		//The value: 88 exist in an given array
		
		
	}

}
