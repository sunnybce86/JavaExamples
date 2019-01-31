package JavaExaplePractice.JavaExaplePractice;

public class Cricketer {

	public static final int runs = 0;

	public static void main(String[] args) {
		
		boolean isTrue = false;
		
		if (isTrue == true) {
			System.out.println("TRUE TRUE");// Will not be printed
		}
		
		if (isTrue = true) {
			
			System.out.println("TRUE");// Will be printed.
		}
	}

}
