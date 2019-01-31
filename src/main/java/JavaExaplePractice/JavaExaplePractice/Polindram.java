package JavaExaplePractice.JavaExaplePractice;

import java.util.Scanner;

public class Polindram {

	public static void main(String[] args) {

		String original; // Objects of String class
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string/number to check if it is a palindrome");
		//original = in.nextLine();
		
		original= "madam son is nitin";
		
		String[] input =original.split(" ");
		
		for (int i = 0; i < input.length; i++) {
			String reverse = "";
			int length = input[i].length();
			for (int j = length - 1; j >= 0; j--)
				reverse = reverse + input[i].charAt(j);
			
			if (original.equals(reverse))
				System.out.println("Entered string/number is a palindrome.  " + reverse);
			else
				System.out.println("Entered string/number isn't a palindrome.  " + reverse);
			
			
			
		}
		
		
		
		//int length = original.length();
		
		//System.out.println(length);
		
		
		
		/*for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
		*/
	}
}
