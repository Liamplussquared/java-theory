import java.util.*;

public class StackExp {
	public static void main(String args []) {
		Stack<String> stack = new Stack<String>(); 
		stack.push("Liam");
		stack.push("was");
		stack.push("here");
		stack.push("2k20");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// print out using iterator
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}

		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}

		System.out.println("Number elements left: " + stack.size());
	}
}