package JavaExaplePractice.JavaExaplePractice;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicateCharactor {

	public static void main(String[] args) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		String name = "sunny";
		char[] charName = name.toCharArray();

		for (char c : charName) {
			if (charCountMap.containsKey(c)) {

				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);

			} else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
