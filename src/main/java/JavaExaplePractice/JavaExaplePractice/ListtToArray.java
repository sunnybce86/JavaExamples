package JavaExaplePractice.JavaExaplePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListtToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(36);

		int[] arr = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		
		// secound method
		
		list.toArray();
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(Arrays.toString(arr));
		// java 8
		Integer[] arr1 = list.stream().toArray(Integer[] :: new);
		System.out.println(Arrays.toString(arr1));

		List<Integer> list1 = Arrays.asList(arr1); 
		System.out.println("list ===>"+list1);
		
	}

}
