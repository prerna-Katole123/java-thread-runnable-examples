import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_CacheThreadPool {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	Callable<String> callable=new Validate();
	ExecutorService eService=Executors.newCachedThreadPool();
	Future<String> future=eService.submit(callable);
	String result=future.get();
	System.out.println("result:"+result);
	eService.shutdown();
}
}
class Validate implements Callable<String>
{
	
	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		return "cache thread pool";
	}
	
}