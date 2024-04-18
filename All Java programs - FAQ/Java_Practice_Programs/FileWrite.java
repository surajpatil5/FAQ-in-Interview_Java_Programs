import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		
		//Write data using FileWriter & BufferedWriter
		
		FileWriter FW = new FileWriter("C:\\\\Java_Selenium_2024\\\\Test.txt");
		
		BufferedWriter BW = new BufferedWriter(FW);
		
		BW.write("Learn Python");
		BW.write("Also Javascript & cypress");
		
		System.out.println("Finished..........");
		
		BW.close();
		

	}

}
