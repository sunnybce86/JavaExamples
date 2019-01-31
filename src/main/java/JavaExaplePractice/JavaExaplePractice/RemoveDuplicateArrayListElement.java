package JavaExaplePractice.JavaExaplePractice;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicateArrayListElement {
//How to remove repeated elements from List?
		
		public static void main(String[] args) {
			List<String> list = new LinkedList<String>();
			list.add("ram");
			list.add("shyam");
			list.add("ram");
			list.add("ram");
			
			 
			LinkedHashSet<String> hset= new LinkedHashSet<>();
			
			hset.addAll(list);
			
			TreeSet<String> hset1= new  TreeSet<>();
			
			hset1.addAll(list);
			list.clear();
			for (String res: hset1) {
				 System.out.println("TreeSet  "+res);
			}
			
			 
		}
}
