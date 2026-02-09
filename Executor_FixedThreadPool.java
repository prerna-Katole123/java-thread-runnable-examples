import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_FixedThreadPool {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> callable = new FixedPool();
		ExecutorService eService = Executors.newFixedThreadPool(4);
		for(int i=0;i<4;i++) {
		Future<String> future=eService.submit(new FixedPool());
		System.out.println(future.get());
		}
		eService.shutdown();

	}
}

class FixedPool implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return "fixed thread pool";

	}

}
