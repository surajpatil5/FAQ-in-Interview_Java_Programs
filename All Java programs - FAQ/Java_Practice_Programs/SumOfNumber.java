
public class SumOfNumber {

	public static void main(String[] args) {
		
		int a = 34567;
		
		String S = String.valueOf(a);
		int l = S.length();
		int Sum=0;
		
		for(int i=0;i<l;i++)
		{
			int C = S.charAt(i) - '0';
			Sum=Sum+C;
		}
		System.out.println("The sum of all values is: "+Sum);
		//Output - The sum of all values is: 25

	}

}
