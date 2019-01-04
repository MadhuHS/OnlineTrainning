package collections;

import java.util.LinkedList;

public class Mainclass5 {

	public static void main(String[] args) {
		
		LinkedList<Integer> p1 = new LinkedList<Integer>();

		p1.add(40);
		p1.add(10);
		p1.add(60);
		p1.add(30);
		p1.add(10);
		p1.add(50);
		p1.add(60);
		p1.add(20);

		int sz = p1.size();
		System.out.println("size = " + p1.size());
		for (int i = 0; i < sz; i++) {
			System.out.println(p1.get(i));
		}
		System.out.println("size = " + p1.size());
	}

}
