import java.util.*;

class PriorityQ {
	public static void main(String args []) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(10);
		pq.add(20);
		pq.add(15);

		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}