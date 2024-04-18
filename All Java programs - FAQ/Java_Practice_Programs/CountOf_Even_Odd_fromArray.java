
public class CountOf_Even_Odd_fromArray {

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,7,94,5,7,43,33,22,111};
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even: "+arr[i]);
				even++;
			}
			else
			{
				System.out.println("Odd: "+arr[i]);
				odd++;
			}
		}
		System.out.println("The count of even numbers is: "+even);
		System.out.println("The count of odd numbers is: "+odd);
		//Output - The count of even numbers is: 2
		//		   The count of odd numbers is: 9

	}

}
