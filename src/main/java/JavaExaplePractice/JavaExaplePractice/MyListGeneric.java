package JavaExaplePractice.JavaExaplePractice;

import java.util.List;

public class MyListGeneric <T>{
	private List<T> values;

	void add(T value) {
	values.add(value);
	}

	void remove(T value) {
	values.remove(value);
	}
	
	public static void main(String[] args) {
		MyListGeneric<String> myListString = new MyListGeneric<String>();
		myListString.add("Value 1");
		 
		MyListGeneric<Integer> myListInteger = new MyListGeneric<Integer>();
		myListInteger.add(1);
		
		 
		
	}
}