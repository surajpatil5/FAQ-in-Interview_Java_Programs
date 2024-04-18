import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_InbuiltMethod {

	public static void main(String[] args) {
		
		//Integer []a={50,20,30,100,90};
		//Ascending order
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		//Ascending order
//		System.out.println(Arrays.toString(a));		//[50, 20, 30, 100, 90]
//		Arrays.parallelSort(a);
//		System.out.println(Arrays.toString(a));		//[20, 30, 50, 90, 100]
		
		//Descending order
		//Whenever we are applying any ascending or descending scenario on array, make the array data type to Wrapper class
//		System.out.println(Arrays.toString(a));		
//		Arrays.sort(a, Collections.reverseOrder());		//[100, 90, 50, 30, 20]
//		System.out.println(Arrays.toString(a));
		
		
		
//		for(int aftersort:a)
//		{
//			System.out.println(aftersort);
//		}
		
		
		
		Integer []a={50,20,30,100,90,45,67};
		//Ascending order -> Using Arrays.parallelsort & sort method
		//Arrays.parallelSort(a);
		//Arrays.sort(a);
		System.out.println(Arrays.toString(a));		//[50, 20, 30, 100, 90, 45, 67] 
		
		//Descending order
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));			//[100, 90, 67, 50, 45, 30, 20]
		

	}

}
