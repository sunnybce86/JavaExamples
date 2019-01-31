package JavaExaplePractice.JavaExaplePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountOfDuplicateString {
 
	public static void main(String[] args) {
		String para ="Hello how are Hello hi how are you how do you do";
		
		String[] splitedWord= para.split(" ");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for( String entry: splitedWord)
		{
			if (map.containsKey(entry)) {
				
				map.put(entry, map.get(entry)+1);
			} else {
				
				map.put(entry, 1);
				
			}
			
		}
		
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() +" " + entry.getValue());
		}
		
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>(map);
		tm.lastKey();
	}
}
