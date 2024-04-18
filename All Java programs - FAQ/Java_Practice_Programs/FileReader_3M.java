import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader_3M {

	public static void main(String[] args) throws IOException {
		
		//Approach 1 -> FileReader & BufferedReader, while loop
		/*
		FileReader F = new FileReader("C:\\Java_Selenium_2024\\Test.txt");
		
		BufferedReader br = new BufferedReader(F);
		
		String str="";
		
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		*/
		
		
		//Approach 2 -> Using File & Scanner class
		
		File FR = new File("C:\\\\Java_Selenium_2024\\\\Test.txt");
		
		Scanner scanline = new Scanner(FR);
		
//		while(scanline.hasNextLine())
//		{
//			System.out.println(scanline.nextLine());
//		}
//		System.out.println();
//		
		
		
		//Approach 3 -> Using "useDelimeter("\\Z") method
		scanline.useDelimiter("\\Z");
		System.out.println(scanline.next());
		
		
		

		
		
		

	}

}
