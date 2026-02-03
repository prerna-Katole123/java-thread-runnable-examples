
public class ExtendingThread {
public static void main(String[] args) {
	Thread t1=new Demo();
	t1.start();
	
	Thread t2=new Demo();
	t2.start();
}
}
class Demo extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
