package JavaExaplePractice.JavaExaplePractice;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class FuntionalInterfaceDemo {

	
	public static void main(String[] args) {
        
		System.out.println("--------------BiFunction start--------------");
		//
		
        // BiFunction to demonstrate composite functions 
        // Here it will find the sum of two integers 
        // and then return twice their sum 
        BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b; 
  
        // Using addThen() method 
        composite1 = composite1.andThen(a -> 2 * a); 
  
        // Printing the results 
        System.out.println("Composite1 = " + composite1.apply(2, 3)); 
  
        // BiFunction to demonstrate composite functions 
        // Here it will find the sum of two integers 
        // and then return twice their sum 
        BiFunction<Integer, Integer, Integer> composite2 = (a, b) -> a * b; 
  
        // Using addThen() method 
        composite2 = composite2.andThen(a -> 3 * a); 
  
        // Printing the result 
        System.out.println("Composite2 = " + composite2.apply(2, 3));
		
        
        System.out.println("-------------------Consumer start--------------");
        
        //It represents a function which takes in one argument and produces a result. However these kind of functions don’t return any value.
         
     // Consumer to multiply 2 to every integer of a list 
        
        // Consumer to display a number 

        // Consumer to display a number 
        Consumer<Integer> display = a -> System.out.println(a); 
  
        // Implement display using accept() 
        display.andThen(display).accept(10); 
        
        System.out.println(" ");
        System.out.println("-------------------Predicate start--------------");
        
        Arrays.stream(new String[] {"Ram", "Robert", "Rahim","Robin"})
        		.filter(s -> s.startsWith("Ro"))
        		.map(s->s.toLowerCase())
        		.sorted()
        		.forEach(System.out::println);
	}
}
