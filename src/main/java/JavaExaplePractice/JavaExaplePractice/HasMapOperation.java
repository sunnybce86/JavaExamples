package JavaExaplePractice.JavaExaplePractice;

import java.util.*;

public class HasMapOperation {

	public static void iterateHasMap(HashMap<String, String> hm) {
		// using Map.Entry interface
		for (Map.Entry<String, String> mapEntry : hm.entrySet()) {
			System.out.println(mapEntry.getValue() + "--->" + mapEntry.getKey());
		}

		// using iterator
		Set set = hm.entrySet();
		Iterator<?> itr = set.iterator();

		while (itr.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> mapentry = (Map.Entry<String, String>) itr.next();
			System.out.println(mapentry);
		}

		// using keyset() and values() method

		hm.keySet();
		hm.values();

		for (String key : hm.keySet()) {
			System.out.println("Key--->" + key);
		}

		for (String value : hm.values()) {
			System.out.println("Value--->" + value);
		}

		// using java8
		hm.forEach((k, v) -> {
			
			System.out.println(k+"----"+v);
		});
		

	}

	public static void sortingHashmap(HashMap<String, String> hm) {
		TreeMap<String, String> tm = new TreeMap<String, String>();
		// using putAll method
		tm.putAll(hm);

		for (Map.Entry<String, String> treeMap : tm.entrySet()) {

			System.out.println("sorted hasmap for keys=====>" + treeMap);
		}
		// using treemap constractor
		TreeMap<String, String> tmc = new TreeMap<String, String>(hm);
		for (Map.Entry<String, String> treeMap : tmc.entrySet()) {

			System.out.println("sorted hasmap for keys=====>" + treeMap);
		}

		// using ArrayList

		ArrayList<String> al = new ArrayList<String>(hm.keySet());

		Collections.sort(al);

		for (String key : al) {
			System.out.println(key + "----------->" + hm.get(key));
		}

	}

	public static void main(String args[]) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("102", "suraj");
		hm.put("103", "ram");
		hm.put("105", "priya");
		hm.put("104", "lucy");
		System.out.println("--------------iteration ways------------");
		HasMapOperation.iterateHasMap(hm);
		System.out.println("--------------Sorting hashMap-----------");
		HasMapOperation.sortingHashmap(hm);
	}

}
