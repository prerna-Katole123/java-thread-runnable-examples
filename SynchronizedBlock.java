
public class SynchronizedBlock {
	public static void main(String[] args) {
		IndianLeaders i = new IndianLeaders();
		Thread t1 = new India("narendra modi", i);
		t1.start();
		Thread t2 = new India("ramnath shinde", i);
		t2.start();
		Thread t3 = new India("devendra fadanvis", i);
		t3.start();
		Thread t4 = new India("nirmala sitaraman", i);
		t4.start();

	}
}

class India extends Thread {
	private String name;
	private IndianLeaders indianLeaders;

	public India(String name, IndianLeaders indianLeaders) {
		super();
		this.name = name;
		this.indianLeaders = indianLeaders;
	}

	@Override
	public void run() {
		indianLeaders.showLeaderNames(name);
	}

}

class IndianLeaders {
	public void showLeaderNames(String name) {
		if (name.length() > 10) {
			synchronized (this) {
			System.out.println(Thread.currentThread().getName() + "indian leaders:" + name);
			System.out.println(Thread.currentThread().getName() + "indian leaders:" + name);
			System.out.println(Thread.currentThread().getName() + "indian leaders:" + name);
			}
	}}
}
