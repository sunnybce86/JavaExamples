package JavaExaplePractice.JavaExaplePractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementPrint {

	public static void main(String[] args) {
		int[] arr= {1,2,1,2,4,5,1,2,3,1};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr))
			{
				map.put(count, map.get(arr)+1);
			}else
			{
				map.put(count, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+ entry.getValue());
		}
		
		
	}
	
}
