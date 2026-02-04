
public class PrintTopperNamee {
	public static void main(String[] args) {
		ShowResult s = new ShowResult();
		Thread t1 = new Result("ram", s);
		t1.start();
		Thread t2 = new Result("siya", s);
		t2.start();
	}
}

class Result extends Thread {
	private String name;
	private ShowResult show;

	public Result(String name, ShowResult show) {
		super();
		this.name = name;
		this.show = show;
	}

	@Override
	public void run() {
		show.printTopperName(name);
	}
}

class ShowResult {
	public void printTopperName(String name) {
		System.out.println(Thread.currentThread().getName() + name);
		System.out.println(Thread.currentThread().getName() + name);
		
	}
}
