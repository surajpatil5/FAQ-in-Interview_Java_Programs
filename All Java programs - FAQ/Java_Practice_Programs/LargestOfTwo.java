
public class LargestOfTwo {

	public static void main(String[] args) {
	
		int a = 29, b=45;
		
		//Find largest
		int c = (a>b) ? a:b;
		System.out.println("Largest number is: "+c);		//Largest number is: 45
		
		//Find Smallest
		int d = (a<b) ? a:b;
		System.out.println("Smallest number is: "+d);		//Smallest number is: 29
	}

}
