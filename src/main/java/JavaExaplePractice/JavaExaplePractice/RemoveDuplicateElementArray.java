package JavaExaplePractice.JavaExaplePractice;

public class RemoveDuplicateElementArray {

	private static int[] removeDuplicateElementArray(int[] arr, int n) {

		 int[] temp = new int[n]; 
		int count=0;
		for (int i = 0; i < (arr.length)-1; i++) {
			if((arr[i] != arr[i+1]))
			{
				temp[count++] = arr[i];
			}
			
		}
		temp[count++] = arr[n-1];     
        // Changing original array  
       
		return temp;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;
		int arr1[]  = removeDuplicateElementArray(arr, length);
		// printing array elements
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
