public class GenericClass<Type> {
	private Type t;

	public void add(Type t) {
		this.t = t;
	}

	public Type get() {
		return t;
	}


	public static void main(String args[]) {
		GenericClass<Integer> integerClass = new GenericClass<Integer>();
		integerClass.add(256);
		System.out.println(integerClass.get());

		GenericClass<String> stringClass = new GenericClass<String>();
		stringClass.add("helloWorld!");
		System.out.println(stringClass.get());
	}
}


