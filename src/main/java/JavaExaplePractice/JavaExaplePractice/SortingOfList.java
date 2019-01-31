package JavaExaplePractice.JavaExaplePractice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingOfList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("rahul");
		list.add("shyam");
		list.add("ankit");
		list.add("ram");
		
		Collections.sort(list);
		
		for(String res : list)
		{
			System.out.println(res);
		}
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("-------After reverse----------");
		for(String res : list)
		{
			System.out.println(res);
		}
	}
}
