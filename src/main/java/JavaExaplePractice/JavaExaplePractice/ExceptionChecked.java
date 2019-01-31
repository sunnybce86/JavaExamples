package JavaExaplePractice.JavaExaplePractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionChecked {
	
	public static void main(String[] args)  { //throws FileNotFoundException {
	
		// The program doesn’t compile, because the function main() uses FileReader() and FileReader() 
		//throws a checked exception FileNotFoundException.
		FileReader fr= new FileReader("C:\\\\test\\\\a.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		for (int i = 0; i < 10; i++) {
			
			//It also uses readLine() and close() methods, and these methods also throw checked exception IOException
			br.readLine();
			
			br.close();
		}
		
		
	}

}
