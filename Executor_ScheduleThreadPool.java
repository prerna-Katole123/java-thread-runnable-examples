import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executor_ScheduleThreadPool {
	public static void main(String[] args) {
		Callable<String> callable = new ScheduledPool();
		ScheduledExecutorService sExecutorService = Executors.newScheduledThreadPool(2);
		sExecutorService.schedule(callable, 5, TimeUnit.SECONDS);
		sExecutorService.shutdown();
	}
}

class ScheduledPool implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		return "scheduled thread pool";
	}

}
