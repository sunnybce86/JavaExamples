package JavaExaplePractice.JavaExaplePractice;

/*
 * Unchecked are the exceptions that are not checked at compiled time. In C++, all exceptions are unchecked, so it is not
 *  forced by the compiler to either handle or specify the exception. It is up to the programmers to be civilized, and 
 *  specify or catch the exceptions.
In Java exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked.
 */

public class ExceptionUnchecked {

	public static void main(String[] args) {
		int x=12;	
		int y=0;
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at JavaExaplePractice.JavaExaplePractice.ExceptionUnchecked.main(ExceptionUnchecked.java:18)

		int z=x/y;
	}
	
}
