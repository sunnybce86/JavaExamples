package JavaExaplePractice.JavaExaplePractice;
public class Test {

	public static int[] leftRotation(int[] intArray, int numOfRotations) {
		int temp = 0;
		int n = intArray.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < intArray.length; j++) {
				if (numOfRotations == 1) {

					temp = intArray[i];
					intArray[i] = intArray[n - 1];
					intArray[n - 1] = temp;

				}
			}

		}

		return intArray;
	}

	public static void main(String[] args) {
		int a = 7;
		System.out.println(a);
		System.out.println(a++ );
		int b=a++;
		System.out.println(b);
		int c=a++;
		System.out.println(c);
		int d=a++;
		System.out.println(d);
		
		int[] intArray = { 1, 2, 3, 4, 5 };

		int[] intArray1 = leftRotation(intArray, 1);
		for (int i = 0; i < intArray1.length; i++) {
			//System.out.println(intArray1[i]);
		}

	}
}
 