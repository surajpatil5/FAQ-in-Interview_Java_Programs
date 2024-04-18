

public class Sorting_UsingBubbleSort {

	public static void main(String[] args) {
	
		int []a={50,20,30,100,90,45,67};
		
		for(int i=0;i<a.length;i++)			//50 
		{
			for(int j=i+1;j<a.length;j++)   //20
			{
				if(a[i]>a[j])     //50>20    50>30 
				{
					int temp = a[j];			//a[i]=20 & a[j+1]=50
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		for(int val:a)
		{
			System.out.print(val+" ");			//Output - 20 30 45 50 67 90 100 
		}
		
		}
	}
