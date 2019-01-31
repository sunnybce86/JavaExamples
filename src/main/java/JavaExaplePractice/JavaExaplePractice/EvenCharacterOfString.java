package JavaExaplePractice.JavaExaplePractice;

public class EvenCharacterOfString {

	public static void main(String[] args) {
		String input = "Helllo";
		char output = 0;
		input.toUpperCase();
		for (int i = 0; i < input.length(); i++) {

			if (i % 2 != 0) {
				output = input.charAt(i);
				//System.out.print(Character.toString(output).toUpperCase());
			}

		}
		// secound question
		
		String input1="My|name|is|Test";
		
		String[] res=input1.split("|");
		
		for (int i = 0; i < res.length; i++) {
		     
				String rs=res[i].replace("|", "  ");
				System.out.print(rs);
			  
		}
		

	}
}
