package JavaExaplePractice.JavaExaplePractice;

public class CheckStringIsPalindrom {

	public static void palindrom(String input) {
		String resultString="";
		input.toCharArray();
		
		for (int i = input.length()-1; i >=0 ; i--) {
			resultString=resultString+input.charAt(i);
		}
		
		if(resultString.equals(input))
		{
			System.out.println(input + " is a palindrom number");
		}else
			System.out.println(input + " is not a palindrom number");
	}

	public static void main(String[] args) {

		String input = "ABCAA";

		palindrom(input);

	}
}
