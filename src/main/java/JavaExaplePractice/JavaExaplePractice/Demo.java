package JavaExaplePractice.JavaExaplePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	static Object[] sum_up_recursive(ArrayList<Integer> numbers, int target, ArrayList<Integer> partial) {
		int s = 0;
		for (int x : partial)
			s += x;
		if (s == target)
			System.out.println("sum(" + Arrays.toString(partial.toArray()) + ")=" + target);
		if (s >= target)
			//return "";
		for (int i = 0; i < numbers.size(); i++) {
			ArrayList<Integer> remaining = new ArrayList<Integer>();
			int n = numbers.get(i);
			for (int j = i + 1; j < numbers.size(); j++)
				remaining.add(numbers.get(j));
			ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
			partial_rec.add(n);
			sum_up_recursive(remaining, target, partial_rec);
		}
		
		 
		return  partial.toArray();
	}

	static Object[] sum_up(ArrayList<Integer> numbers, int target) {
		 
		 return sum_up_recursive(numbers, target, new ArrayList<Integer>());
		 
	}
	 
	public static void main(String[] args) {

		  int sum = 0;
		  int child = 12;// no of child
		  Integer [] arr = { 5 ,3 ,2 ,5, 1 };
		
		
		  Object[]  count=sum_up(new ArrayList<Integer>(Arrays.asList(arr)), child);
		  
		 // Integer[] res1 = res.toArray(new Integer[0]); 
		 
		 System.out.println("sum"+count);
		 
		if (count.length>0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		} 
	}

}
