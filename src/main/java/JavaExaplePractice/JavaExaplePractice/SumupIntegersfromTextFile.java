package JavaExaplePractice.JavaExaplePractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SumupIntegersfromTextFile {

	public static void SumOfInteger() {

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\sunny.singh\\Desktop\\SumOfInter.txt";
		File file = new File(path);
		BufferedReader buffer = null;
		FileReader fileReader = null;
		fileReader = new FileReader(file);
		buffer = new BufferedReader(fileReader);
		String line;
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		while ((line = buffer.readLine()) != null) {
			int number = Integer.valueOf(line);
			count++;
			map.put(count, number);
			// System.out.println(line);
		}

		Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		int sum = 0;
		while (itr.hasNext()) {
			Entry<Integer, Integer> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			sum = sum + entry.getValue();

		}
		System.out.println(sum);
		 
	}

}
