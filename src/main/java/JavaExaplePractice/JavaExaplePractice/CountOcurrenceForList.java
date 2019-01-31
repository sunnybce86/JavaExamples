package JavaExaplePractice.JavaExaplePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOcurrenceForList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("ram");
		list.add("shyam");
		list.add("rahul");
		Map<String,Integer> map =new HashMap<String,Integer>();
		
		for(String list1: list)
		{
			if(map.containsKey(list1))
			{
				map.put(list1, map.get(list1)+1);
			}
			else
			{
				map.put(list1, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
