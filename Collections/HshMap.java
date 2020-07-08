import java.util.*;

public class HshMap {
	public static void main (String args []) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "hello");
		map.put(2, "world!");
		map.put(5000, "liam");

		System.out.println(map);
	}
}