package JavaExaplePractice.JavaExaplePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentDetail {
	int rollno;
	String name, address;

	// Constructor
	public StudentDetail(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

public class ListSortingByLambda {

	public static void main(String[] args) {
		ArrayList<StudentDetail> ar = new ArrayList<StudentDetail>();
		ar.add(new StudentDetail(111, "bbbb", "london"));
		ar.add(new StudentDetail(131, "aaaa", "nyc"));
		ar.add(new StudentDetail(121, "cccc", "jaipur"));
		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		Comparator<StudentDetail> byRollNo= (StudentDetail s1, StudentDetail s2) ->{	
			if(s1.rollno==s2.rollno)  
				return 0;  
				else if(s1.rollno>s2.rollno)  
				return 1;  
				else  
				return -1;
			};
		
		Comparator<StudentDetail> byName =(StudentDetail s1, StudentDetail s2) -> s1.name.compareTo(s2.name);
		
		Collections.sort(ar, byName);
		Collections.sort(ar, byRollNo);
		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}
