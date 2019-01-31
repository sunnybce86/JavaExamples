package JavaExaplePractice.JavaExaplePractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Functions {
	
	public void show(int a) {
		
		System.out.println("primitive");
		
	}

	public void show(Long a) {
		
		System.out.println("wrapper");
		
	}

	// factorial recursiion
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {

		// -------factorial number---
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		fact = factorial(number);
		System.out.println("Factorial of using recurrsiion" + number + " is: " + fact);

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);

		// -----

		Java8Functions j = new Java8Functions();
		// j.show(10);
		j.show(Long.valueOf(10));

		List<String> color = Arrays.asList("red", "blue", "green", "orange");

		List<String> result = color.stream() // convert list to stream
				.filter(line -> !"green".equals(line) && !"orange".equals(line)) // we dont like mkyong
				.collect(Collectors.toList()); // collect the output and convert streams to a List

		result.forEach(a -> System.out.println(a));

		// -------------------

		/*
		 * List<Person> persons = Arrays.asList( new Person("mkyong", 30), new
		 * Person("jack", 20), new Person("lawrence", 40) );
		 * 
		 * List<Person>
		 * person1=persons.stream().filter(p->!"jack".equals(p.getName())).collect(
		 * Collectors.toList());
		 * 
		 * 
		 * person1.forEach(a->System.out.println(a.getAge()));
		 * 
		 * Person result1 = persons.stream() .filter(p -> "jack".equals(p.getName()) &&
		 * 20 == p.getAge()) .findAny() .orElse(null); System.out.println(result1);
		 */
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 2);
		int b = 2;
		List<Integer> numbers123 = numbers.stream().map(a -> (a + b)).collect(Collectors.toList());
		numbers123.forEach(a -> System.out.println("" + a));

		int sum1 = 0;
		for (int number1 : numbers)
			if (number1 % 2 != 0)
				sum1 = sum1 + number1;
		System.out.println(sum1);

		numbers.stream().filter(a -> a % 2 != 0).reduce(0, Integer::sum);
		System.out.println("Sum of odd no------>" + numbers.stream().filter(a -> a % 2 != 0).reduce(0, Integer::sum));
		Arrays.stream(new String[] { "Ram", "Robert", "Rahim" }).filter(s -> s.startsWith("Ro"))
				.map(String::toLowerCase).sorted().forEach(System.out::println);

		numbers.stream().distinct().sorted().forEach(a -> System.out.print(a));// funtional programing
	}

}
