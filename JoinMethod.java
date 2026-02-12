
public class JoinMethod {
public static void main(String[] args) throws InterruptedException {
	Thread t1=new JoinExample();
	Thread t2=new JoinExample();
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	
	System.out.println("main thread finished");
	
}
}
class JoinExample extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
