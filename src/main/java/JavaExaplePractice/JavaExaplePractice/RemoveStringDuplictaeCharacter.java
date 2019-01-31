package JavaExaplePractice.JavaExaplePractice;

public class RemoveStringDuplictaeCharacter {

	public static void main(String[] args) {
		String input = "sunny";
		
		char[] charArray = input.toCharArray();

		String notDuplicate = "";
		StringBuffer sb =new StringBuffer();
		
		for (int i = 0; i < charArray.length - 1; i++) {
			
			if (charArray[i] == charArray[i + 1]) {

				notDuplicate = notDuplicate + sb.append(charArray[i]);
				
			} else {
				
				notDuplicate = notDuplicate + charArray[i];
				
			}
		}

		System.out.println(notDuplicate);
	}
}
