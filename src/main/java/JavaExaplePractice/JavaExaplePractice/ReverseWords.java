package JavaExaplePractice.JavaExaplePractice;

public class ReverseWords {

	public static void main(String[] args) {

		String words = "I love you yogita";
		String[] res = words.split(" ");

		String original = " ";
		String usingStringBuffer = " ";

		StringBuffer sb = new StringBuffer();

		for (int i = res.length - 1; i >= 0; i--) {

			original = original + " " + res[i];
		}
		
		for (int i = res.length - 1; i >= 0; i--) {

			usingStringBuffer = usingStringBuffer + sb.append(" "+res[i]);
		}
		
		System.out.println("Using Normal logic --------"+original);
		
		System.out.println("Using Normal String Buffer -----"+sb);

	}

}
