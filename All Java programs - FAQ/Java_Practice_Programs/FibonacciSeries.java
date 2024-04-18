
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		//Fibonacci Series -> 0 1 1 2 3 5 8 12 ............
		
		int a=0, b=1;
		int temp=0;
		int val=10;
		
		for(int i=0;i<=val;i++)
		{
			temp = a+b;
			a=b;
			b=temp;
			System.out.println(temp);			
		}
		
	}

}
