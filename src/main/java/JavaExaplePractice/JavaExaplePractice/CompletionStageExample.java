package JavaExaplePractice.JavaExaplePractice;

import java.time.LocalTime;
//https://www.logicbig.com/tutorials/core-java-tutorial/java-multi-threading/completion-stage-and-completable-future.html
/*
 * the CompletableFuture class implements the CompletionStage interface
 */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class CompletionStageExample {
	
	private static void performTask(String stage) {
		System.out.println("---------");
		System.out.printf("stage: %s, time before task: %s, thread: %s%n", stage, LocalTime.now(),
				Thread.currentThread().getName());
		try {
			// simulating long task
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("stage: %s, time after task: %s, thread: %s%n", stage, LocalTime.now(),
				Thread.currentThread().getName());
	}

	@SuppressWarnings({ "rawtypes", "rawtypes" })
	public static void main(String[] args) {
		/// Creating and Running tasks without returning result

		CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
			System.out.println("running, in thread: " + Thread.currentThread().getName());
		});

		cf.join();// waits until task is completed
		System.out.println("main exiting, thread: " + Thread.currentThread().getName());

		/*
		 * CompletableFuture.join() vs Future.get()
		 * 
		 * The join() and get() methods can interchangeably be used. The main difference
		 * is that the join() method does not throw a checked exception, leading to
		 * simpler patterns.
		 */

		/// Chaining CompletionStage(s) with runAsync():

		CompletionStage<Void> cf1 = CompletableFuture.runAsync(() -> performTask("first stage"));
		
		cf1 = cf1.thenRun(() -> performTask("second stage"));
		//cf1 = cf1.thenRun(() -> performTask("third stage"));
		cf1 = cf1.thenRunAsync(() -> performTask("third stage"));
		
		((CompletableFuture) cf1).join();// waits until task is completed
		System.out.println("main exiting");
		
		//----------------------
		
		CompletableFuture.supplyAsync(() -> 16)
        .thenApply(Math::sqrt)
        .thenAccept(System.out::println)
        .join();

	}
}
