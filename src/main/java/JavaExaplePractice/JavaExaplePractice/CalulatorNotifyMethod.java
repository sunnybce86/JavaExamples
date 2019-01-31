package JavaExaplePractice.JavaExaplePractice;

public class CalulatorNotifyMethod {
	
	public static void main(String[] args) throws InterruptedException {

		CalulatorNotifyMethod1 thread = new CalulatorNotifyMethod1();
		CalulatorNotifyMethod1 thread1 = new CalulatorNotifyMethod1();
		CalulatorNotifyMethod1 thread2 = new CalulatorNotifyMethod1();

		synchronized (thread) {
			
			thread.start();
			thread.wait();

		}
		System.out.println(thread.sumUptoMillion);
	}
}