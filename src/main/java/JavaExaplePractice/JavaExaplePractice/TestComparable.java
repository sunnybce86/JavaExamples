package JavaExaplePractice.JavaExaplePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparable {

	
	public static void main(String[] args) {
		List<Persons> cricketers = new ArrayList<Persons>();
		cricketers.add(new Persons("ac",9996, "Bradman"));
		cricketers.add(new Persons("fs",14000, "Sachin"));
		cricketers.add(new Persons("sd",12000, "Dravid"));
		cricketers.add(new Persons("cd",11000, "Ponting"));
		System.out.println(cricketers);
		 
		Comparator<Person> cm2=Comparator.comparing(Person::getId);
		
		System.out.println(cm2.toString());
	}
	
}
