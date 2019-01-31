package JavaExaplePractice.JavaExaplePractice;

public class TestCustomException {
	static void compute(int a) throws CustomException {
		if (a > 10)
			throw new CustomException(a);
		System.out.println("No error in prog. no exception caught");
	}

	public static void main(String[] args) {
		try {
			  compute(5);
			compute(12);
		} catch (CustomException ex1) {
			System.out.println(ex1);
		}
	}
}
