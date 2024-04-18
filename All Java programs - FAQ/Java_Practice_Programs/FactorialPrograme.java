import java.util.Scanner;

public class FactorialPrograme {

	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int input = val.nextInt();
		long fact=1;
	
		for(int i=1;i<=input;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of "+input+" is: "+fact);
		
	}
}
