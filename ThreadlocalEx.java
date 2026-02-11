
public class ThreadlocalEx {
	public static void main(String[] args) {
		Name n = new Name();
		Thread t1 = new Thread(() -> n.m1("ram"));
		t1.start();
		Thread t2 = new Thread(() -> n.m1("preru"));
		t2.start();

	}
}

class Name {
	private String name;
	ThreadLocal<String> tLocal = new ThreadLocal<>();

	public void m1(String name) {
		tLocal.set(name);
		m2();
	}

	public void m2() {
		m3();
	}

	public void m3() {
		System.out.println(Thread.currentThread().getName() + " " + tLocal.get());
	}
}
