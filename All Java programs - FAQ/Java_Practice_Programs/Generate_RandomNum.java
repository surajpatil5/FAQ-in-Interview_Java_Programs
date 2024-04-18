import java.util.Random;

public class Generate_RandomNum {

	public static void main(String[] args) {
		
		//Using Random class
		Random R = new Random();
		int val = R.nextInt(20);   //Pass value so it'll generate number below to this value
		
		System.out.println(val);
	}

}
