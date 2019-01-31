package JavaExaplePractice.JavaExaplePractice;
import java.util.function.Supplier;

public class TestSupplier {
	 public static void main(String[] args) {
		 Supplier<Persons> supplier=()->{
			 
			 Persons p= new Persons("Sunny",5,"test");
			 
			 return p;
		 };
		 
		 System.out.println(supplier.get());;
	 }
}
