package JavaExaplePractice.JavaExaplePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementArrayUsingHashSet {
	
	public static Set<Integer> removeDuplicateElementArrayUsingMap(int[] arr,int length)
	{
		List lst = Arrays.asList(arr);
		Set<Integer> hSet = new HashSet<Integer>(lst); 
		return hSet ;	
	}
	
	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;
		Set<Integer> arr1  = removeDuplicateElementArrayUsingMap(arr, length);
		 
		Iterator value = arr1.iterator(); 
		  
        // Displaying the values after iterating through the set 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
			
	}
}
