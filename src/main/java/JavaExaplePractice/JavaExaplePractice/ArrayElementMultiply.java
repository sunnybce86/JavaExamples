package JavaExaplePractice.JavaExaplePractice;

import java.util.Arrays;

public class ArrayElementMultiply {

	
	
	 @SuppressWarnings("null")
	public static void main(String[] args) {
		 int[] arr= {1,5,8,9,6};
		 int[] result = new int[5];
		 int res=0;
		 for (int i = 0; i < arr.length; i++) {
			
			 for (int j = i+1; j < arr.length; j++) {
				
				  res += arr[i]*arr[j];
				 
				  result[i] =res;
			}
			
		}
		 
		 System.out.println(Arrays.toString(result));
		 
	}
}
