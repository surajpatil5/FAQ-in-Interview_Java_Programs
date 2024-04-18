
public class FindLowestNum_inArray {

	public static void main(String[] args) {
		
		int []a={50,20,30,100,90,45,67};
		int small=a[0];
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					if(a[i]<small)
					{
						small=a[i];
					}
				}
			}
		}
		System.out.println("Smallest value in given array is : "+small);
		//Output - Smallest value in given array is : 10
	}

}
