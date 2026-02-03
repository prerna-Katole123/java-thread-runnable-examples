
public class ImplementRunnable {
public static void main(String[] args) {
	Runnable r=new Example();
	
	Thread t=new Thread(r);
	t.start();
}
}
class Example implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
