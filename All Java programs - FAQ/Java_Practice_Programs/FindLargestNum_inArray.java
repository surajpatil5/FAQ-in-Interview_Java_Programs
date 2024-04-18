
public class FindLargestNum_inArray {

	public static void main(String[] args) {
		
		int []a={50,20,30,100,90,45,67};
		int large=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])     //100     > 50 >20 >30 >100 >90 >45 >67
				{
					if(a[i]>large)   
					{
					large = a[i];    //50, 100, 90
					}
				}
			}
		}
	
		System.out.println("Largest value in given array is : "+large);
	
		//Output -> Largest value in given array is : 100
		
		
	}

	
}

