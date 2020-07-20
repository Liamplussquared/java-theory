public class GenericMaximum {
	public static void main (String args[]) {
		System.out.println(getMax(1, 2, 3));
		System.out.println(getMax(1.1, 2.2, 3.3));
		System.out.println(getMax("hello", "world", "!"));
	}

	// getMax returns the maxaimum of three elements
	public static <Type extends Comparable<Type>> Type getMax(Type x, Type y, Type z) {
		Type max = x;
		if (y.compareTo(max) > 0) max = y;
		if(z.compareTo(max) > 0) max = z;
		return max;
	}
}