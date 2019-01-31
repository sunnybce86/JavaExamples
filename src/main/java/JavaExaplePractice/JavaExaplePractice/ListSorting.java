package JavaExaplePractice.JavaExaplePractice;

import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student. 
class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}


	// Used for sorting in ascending order of
	// roll number

 class Sortbyname implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll number

	public int compare(Student s1, Student s2) {
		
		 return s1.name.compareTo(s2.name);
		
		  
	}
	 
}

class SortRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.rollno==o2.rollno)
		{
			return 0;
			
		}else if(o1.rollno>o2.rollno)
		{
			return 1;
		}else
		{
			return -1;
		}
	}
  
}
 
public class ListSorting {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		  Collections.sort(ar,  new Sortbyname());
		  Collections.sort(ar, new SortRollNo());
		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}
