import java.util.concurrent.ScheduledThreadPoolExecutor;
import static java.util.concurrent.TimeUnit.*;

public class JavaLessonEighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addThreadsToPool();
	}

	
	public static void addThreadsToPool() {
		
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calender"), 10, 10, SECONDS);
		
		System.out.println("Number of Threads: " + Thread.activeCount());
		
		Thread[] listofThreads = new Thread[Thread.activeCount()];
		
		Thread.enumerate(listofThreads);
		
		for(Thread i : listofThreads) {
			System.out.println(i.getName());
		}
		
		for(Thread i : listofThreads) {
			System.out.println(i.getPriority());
		}
		
		eventPool.shutdown();
		
		try 
		{
			Thread.sleep(20000);
		}
		catch(InterruptedException e) {}
		
	}
}
