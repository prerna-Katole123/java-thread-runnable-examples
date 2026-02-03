
public class ThreadEx {
public static void main(String[] args) {
	Thread t1=new Test("hello i am from india");
	Thread t2=new Test("hello i am from chennai");
	t1.start();
	t2.start();
}
}
class Test extends Thread{
	private String message;
	
	public Test(String message)
	{
		this.message=message;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+message);
		System.out.println(Thread.currentThread().getName()+message);
		System.out.println(Thread.currentThread().getName()+message);
	}
}
