package JavaExaplePractice.JavaExaplePractice;

public class Fibonacci {

	static int n1 = 0, n2 = 1, temp = 0;

	public static void show(int count) {

		if (count > 0) {
			
			//for (int i = 0; i < count; i++) {
				temp = n1 + n2;

				n1 = n2;
				n2 = temp;

				System.out.print(" " + temp);	
			//}

			show(count - 1);
		}
	}

	public static void main(String[] args) {
		int count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		show(count - 2);
	}
}
