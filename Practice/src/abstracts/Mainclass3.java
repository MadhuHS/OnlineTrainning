package abstracts;

interface RunInt1 {
	public void count();
}

interface RunInt2 {
	public void view();
}

class Demo extends Object implements RunInt1, RunInt2 {
	@Override
	public void view() {
		System.out.println("View() of Demo");
	}

	@Override
	public void count() {
		System.out.println("count() of Demo");

	}
}

public class Mainclass3 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.count();
		d1.view();
	}

}
