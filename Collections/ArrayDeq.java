import java.util.*;

public class ArrayDeq {
	public static void main(String args[]) {
		Deque<Integer> ad = new ArrayDeque<Integer>(10);

		ad.add(1);
		ad.addFirst(2);
		ad.addLast(3);

		System.out.println(ad);

		ad.push(4);
		ad.poll();
		ad.pollFirst();
		ad.pollLast();

		System.out.println(ad);
	}
}