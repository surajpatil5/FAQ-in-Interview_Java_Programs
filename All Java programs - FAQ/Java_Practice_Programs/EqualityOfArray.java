import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		
		int a[] = {10,11,11,13,14,15};
		int b[] = {10,11,12,13,14,15};
		
		
		//First Aproach using 'Arrays' class
		boolean result = Arrays.equals(a, b);

		if(result==true)
		{
			System.out.println("Arrays are equal");
		}
		else
			System.out.println("Arrays are not equal");
		
	}

}
