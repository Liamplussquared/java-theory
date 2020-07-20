public class GenericPrinting {
	public static void main(String args[]) {
		Integer intArr[] = {1,2,3,4,5,6};
		Double doubleArr[] = {1.1,2.2,3.3,4.4,5.5};
		Character charArr[] = {'a','b','c','d','e'};

		printArray(intArr);
		printArray(doubleArr);
		printArray(charArr);
	}

	public static <E> void printArray( E[] inputArray) {
		for (E element : inputArray) {
			System.out.println(element);
		}
	}
}