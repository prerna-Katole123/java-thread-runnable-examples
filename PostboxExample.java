import java.util.Stack;

public class PostboxExample {
	public static void main(String[] args) {
		Stack<String> postbox = new Stack<>();
		Producer produce = new Producer(postbox);
		Consumer consume = new Consumer(postbox);
		produce.start();
		consume.start();
	}
}

class Producer extends Thread {
	private Stack<String> postbox;

	public Producer(Stack<String> postbox) {
		super();
		this.postbox = postbox;
	}

	@Override
	public void run() {
		synchronized (postbox) {
			System.out.println("producer producing data");
			postbox.push("hello ");
			postbox.notify();
		}
	}
}

class Consumer extends Thread {
	private Stack<String> postbox;

	public Consumer(Stack<String> postbox) {
		super();
		this.postbox = postbox;
	}

	@Override
	public void run() {
		synchronized (postbox) {
			if (postbox.isEmpty()) {
				try {
					postbox.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("consumer consuming data");
				postbox.pop();

			}
		}
	}
}
