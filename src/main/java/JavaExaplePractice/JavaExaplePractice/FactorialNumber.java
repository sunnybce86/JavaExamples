package JavaExaplePractice.JavaExaplePractice;

public class FactorialNumber {

	public static void Factorial(int number) {
		int fac = 1;

		for (int i = 1; i <= number; i++) {
			fac = fac * i;
		}

		System.out.println(fac);
	}

	public static int FactorialByRecurrsion(int number) {
		if (number > 1)
			return (number * FactorialByRecurrsion(number - 1));
		else
			return 1;
	}

	public static void main(String[] args) {
		int number = 5;
		Factorial(number);
		int fac = FactorialByRecurrsion(number);
		System.out.println(fac);
	}

}
