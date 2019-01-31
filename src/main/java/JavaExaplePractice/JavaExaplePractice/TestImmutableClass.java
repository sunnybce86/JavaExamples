package JavaExaplePractice.JavaExaplePractice;

public class TestImmutableClass {// compile error //extends ImmutableClassInJava{
	public static void main(String[] args) {
		ImmutableClassInJava obj = new ImmutableClassInJava("123456");
		ImmutableClassInJava obj1 = new ImmutableClassInJava("585456");
		System.out.println(obj.pancardNumber);
		System.out.println(obj1.pancardNumber);
		
		//compile error
		//obj1.pancardNumber="256363";
		
	}
}
