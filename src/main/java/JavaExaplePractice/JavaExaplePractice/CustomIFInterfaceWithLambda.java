package JavaExaplePractice.JavaExaplePractice;

public class CustomIFInterfaceWithLambda {

	public static void main(String[] args) {
		Greetting greet=()->System.out.println("Hello Lamda");
		
		Sum sum=(int a, int b)->a+b;
		
		System.out.println(greet);
		
		System.out.println(sum);
		
	}
}

 