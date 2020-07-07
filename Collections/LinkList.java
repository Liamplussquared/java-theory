import java.util.*;
import java.io.*;

class LinkList {
	public static void main(String [] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		for(int i = 0; i < 10; i++) {
			ll.add(i);
		}

		ll.remove(3);

		System.out.println(ll);

		for(int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
	}
}