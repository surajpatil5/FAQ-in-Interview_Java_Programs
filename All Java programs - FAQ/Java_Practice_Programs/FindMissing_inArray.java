
public class FindMissing_inArray {

	public static void main(String[] args) {
		
		int a[] = {6,7,8,10};
		int b[] = {6,7,8,9,10};
		int sumA=0;
		
		for(int i=0;i<a.length;i++)
		{
			sumA = sumA+a[i];
		}
		
		int sumB=0;
		
		for(int i=0;i<b.length;i++)
		{
			sumB = sumB+b[i];
		}
		
		int C = sumB-sumA;
		System.out.println("The missing value is: "+ C);
		
		//Output - The missing value is: 9
	}

}
