import java.util.*;

public class HshSet {
	public static void main(String args []) {
		Set<Integer> set = new HashSet<>();

		for(int i = 0; i < 5; i++){
			set.add(i);
		}

		System.out.println(set);
		set.add(1);
		System.out.println(set);
	}
}