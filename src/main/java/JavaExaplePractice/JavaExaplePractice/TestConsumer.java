package JavaExaplePractice.JavaExaplePractice;
import java.util.function.Consumer;

public class TestConsumer {

	 public static void main(String[] args) {
		 
		 Consumer<String> con1=(arg)->
		 {
			 System.out.println(arg.toString() + "OK");
		 };
		 
		 con1.accept("TestConsumerAccept  ");
		 
		 Consumer<String> con2=(abc)->
		 {
			System.out.println(abc + "ok!!!");
		 };
		 
		 con1.andThen(con2);
	 }
}
