package JavaExaplePractice.JavaExaplePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdLargestArray {

	public static int[] thirdLargestArray(int[] arr) {

		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		return arr;

	}

	public static void main(String[] args) {

		int[] arg = { 1,2,5,6,3,2};
		
		List<int[]> list2 = new ArrayList<int[]>(Arrays.asList(arg));
		
		
		
		
		int[] sortedArray= thirdLargestArray(arg);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i]+" ");
			
		}System.out.println("  ");
		 
		System.out.println("Third largest element "+sortedArray[(arg.length)-3]);
	}
}
