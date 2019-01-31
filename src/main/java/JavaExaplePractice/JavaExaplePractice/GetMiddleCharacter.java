package JavaExaplePractice.JavaExaplePractice;

public class GetMiddleCharacter {

	public static String getMiddleCharacter(String testString) {
		//String testString = "Hesdlko";
		String result="";
		char[] chrArray = testString.toCharArray();
		int length = chrArray.length;
		System.out.println(length / 2);
		if (length % 2 == 0) {
			  result = testString.substring(length / 2 - 1, length / 2 + 1);
			System.out.println(result);
		}
		if (length % 2 != 0) {
			  result = testString.substring(length / 2, length / 2+1);
			System.out.println(result);
		}
		return result;
	}
 
	public static void main(String[] args) {
		getMiddleCharacter("Testq");
	}

}
