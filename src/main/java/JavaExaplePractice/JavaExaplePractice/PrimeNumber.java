package JavaExaplePractice.JavaExaplePractice;

public class PrimeNumber {

	public static void primeno(int num) {
		int flag = 0;
		int m=num/2;
		if (num == 0 || num == 1) {
			System.out.println("Is not a prime number");
		} else {
			for (int i = 2; i <= m; i++) {

				if (num % i == 0) {
					System.out.println(num + " is not prime number");

					flag = 1;

					break;
				}

			}
		}

		if (flag == 0) {
			System.out.println(num + " is prime number");
		}
	}
	
	public static void primenoBetweenTwoNumber(int n1,int n2) {
		
		 
	}
	 

	public static void main(String ars[]) {
		int num = 5;
		primeno(num);
		
		primenoBetweenTwoNumber(1,10);
	}

}
