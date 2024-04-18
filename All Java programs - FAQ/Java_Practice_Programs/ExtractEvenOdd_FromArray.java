
public class ExtractEvenOdd_FromArray {

	public static void main(String[] args) {
	
		int []a= {1,2,3,4,5,6,7,8,9,11,23,45,66,88,90,42,43};
		
		//Using enhanced for loop
		for(int val:a)
		{
			if(val%2==0)
			{
				System.out.println("Even numbers is: "+val);
			}
			else
				System.out.println("Odd numbers is: "+val);
		
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//Using for loop
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even numbers is: "+a[i]);
				evencount++;
			}
			else
			{
				System.out.println("Odd numbers is: "+a[i]);
				oddcount++;
			}
		}
		System.out.println("Count of even number is: "+evencount);
		System.out.println("Count of odd number is: "+oddcount);
	
	}
	
}
