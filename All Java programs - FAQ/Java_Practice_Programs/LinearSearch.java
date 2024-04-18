import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		
		//Linear Search  --> Find the index of element
		int a[]= {10,20,40,50,30};
		int srch_ele=30;
        boolean flag = false;
        
        for(int i=0;i<a.length;i++)
        {
        	if(srch_ele==a[i])
        	{
        		System.out.println("Element is found at index: "+i);   //Element is found at index: 4
        		flag=true;
        		break;
        	}
        }
        
        if(flag==false)
        {
        	System.out.println("Element is not found");
        }
        
        
        
        //Binary Search -> IMP => Array should be in sorted order
        
        int b[]= {10, 20, 30, 40, 50, 70, 80, 90};
               
        System.out.println("The element is present at index: "+Arrays.binarySearch(b, 40));  //The given element is present at index: 3
        
       
	}

}
