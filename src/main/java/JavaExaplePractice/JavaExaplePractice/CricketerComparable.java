package JavaExaplePractice.JavaExaplePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketerComparable implements Comparable<CricketerComparable> {
	int runs;
	String name;

	public CricketerComparable(int runs, String name) {
		super();
		this.runs = runs;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " " + runs;
	}

	public int compareTo(CricketerComparable that) {
		if (this.runs > that.runs) {
			return 1;
		}
		if (this.runs < that.runs) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {

		List<CricketerComparable> cricketers = new ArrayList<CricketerComparable>();
		cricketers.add(new CricketerComparable(9996, "Bradman"));
		cricketers.add(new CricketerComparable(14000, "Sachin"));
		cricketers.add(new CricketerComparable(12000, "Dravid"));
		cricketers.add(new CricketerComparable(11000, "Ponting"));
		System.out.println(cricketers);

		Collections.sort(cricketers);
		System.out.println(cricketers);
	}

}
