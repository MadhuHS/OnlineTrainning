package collections;

import java.util.PriorityQueue;

public class Mainclass4 {
	public static void main(String[] args) {
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		
		p1.add(40);
		p1.add(10);
		p1.add(60);
		p1.add(30);
		p1.add(10);
		p1.add(50);
		p1.add(60);
		p1.add(20);
		
		int sz = p1.size();
        System.out.println("size = "+p1.size());
		for (int i = 0; i < sz; i++)
		{
			System.out.println(p1.poll());
		}
        System.out.println("size = "+p1.size());

	}
}
