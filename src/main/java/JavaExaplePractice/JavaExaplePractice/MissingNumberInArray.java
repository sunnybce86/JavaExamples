package JavaExaplePractice.JavaExaplePractice;

import java.util.Arrays;

public class MissingNumberInArray {

public static void main(String[] args) {
 
	int[] arr = new int[100];
	for (int i = 1; i < 100; i++) {
		if(i==0)
		{
			arr[i]=1;	
		}
		//else
		//arr[i]=i;
	}
	
	 System.out.println(Arrays.toString(arr));
}
}
