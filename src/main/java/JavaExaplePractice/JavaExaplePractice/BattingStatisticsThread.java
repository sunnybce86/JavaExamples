package JavaExaplePractice.JavaExaplePractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BattingStatisticsThread implements Runnable {
	// run method without parameters
	public void run() {
		for (int i = 0; i < 1000; i++) {
		}
		// System.out.println("Running Batting Statistics Thread "+ i);

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		BattingStatisticsThread battingThread1 = new BattingStatisticsThread();
		Thread t1 = new Thread(battingThread1);
		t1.start();
		
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		Future<?> future = executorService1.submit(new Runnable() {
			public void run() {
				System.out.println("From executorService1");
			}
		});

		future.get();

	}
}
