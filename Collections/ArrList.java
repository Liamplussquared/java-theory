import java.io.*;
import java.util.*;

class ArrList {
	public static void main(String [] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i = 0; i < 10; i++) {
			al.add(i);
		}

		al.remove(3);

		System.out.println(al);

		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}
}