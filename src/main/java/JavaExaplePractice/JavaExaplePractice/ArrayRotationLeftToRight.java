package JavaExaplePractice.JavaExaplePractice;


public class ArrayRotationLeftToRight {

	static void leftRotate(int arr[],  int n) 
    { 
		int d=arr.length;
        //for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
	
	public static int[] leftRotatebyOne(int[] arr, int n) {

		int temp;
		int len = arr.length;
		temp = arr[0];
		for (int i = 0; i < len - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[len - 1] = temp;
		
		for (int i = 0; i < len; i++) {
			System.out.print("  " + arr[i]);
		}
		System.out.print(" ,"  );

		return null;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		leftRotate(arr, 1);

	}

}
