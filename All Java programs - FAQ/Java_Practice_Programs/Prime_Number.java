
public class Prime_Number {

	public static void main(String[] args) {
		
		int a = 18;
		int count=0;
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("This number is prime number: "+ a);
		}
		else
			System.out.println("This number is not a prime number: "+ a);

	}

}
