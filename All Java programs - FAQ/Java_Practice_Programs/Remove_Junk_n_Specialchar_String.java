
public class Remove_Junk_n_Specialchar_String {

	public static void main(String[] args) {


		String S = "Ja$&%^va Pr$%^&*ograms 123$%^&*";
		
		//Using Replace method
		System.out.println(S.toString());
		String str = S.replace("$&%^", "").replace("$%^&*", "");  //JavaPrograms123
		System.out.println(str);
		
		
		//Using replace all method
		S=S.replaceAll("[^a-zA-Z0-9]", "");		//JavaPrograms123
		System.out.println(S);
		
		
		
		//Removing spaces using replace all method
		
		String S1 = "   Java    Programs   123    code     ";
		S1=S1.replaceAll("\\s", "");
		System.out.println(S1);				//JavaPrograms123code
	}

}
