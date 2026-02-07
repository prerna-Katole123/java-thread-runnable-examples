import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableExampleSingleThreadExecutor {
public static void main(String[] args) {
	Callable<String> callable=new Demo123();
	ExecutorService es=Executors.newSingleThreadExecutor();
	es.submit(callable);
}
}
class Demo123 implements Callable<String>
{

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		return "callable";
	}
	
}
