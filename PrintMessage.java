
public class PrintMessage {
	public static void main(String[] args) {
		ShowMessage s = new ShowMessage();
		Thread t1 = new Print("hello i am prerna", s);
		t1.start();
		Thread t2 = new Print("hello i am swaraa", s);
		t2.start();
	}
}

class Print extends Thread {
	private String message;
	private ShowMessage show;

	public Print(String message, ShowMessage show) {
		super();
		this.message = message;
		this.show = show;
	}

	@Override
	public void run() {
		show.sendMessage(message);
	}
}

class ShowMessage {
	public synchronized void sendMessage(String message) {
		System.out.println(Thread.currentThread().getName() + message);
		System.out.println(Thread.currentThread().getName() + message);
		System.out.println(Thread.currentThread().getName() + message);
	}
}
