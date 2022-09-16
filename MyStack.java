import java.util.*;

public class MyStack<AnyType> {

	private ArrayList<AnyType> stack;

	public MyStack() {stack = new ArrayList<AnyType>();}

	public AnyType push(AnyType obj) {
		stack.add(obj);
		return obj;
	}

	public AnyType pop() {
		if (stack.size() == 0) {
			return null;
		} else {
			return stack.remove(stack.size() - 1); 
		}
	}

	public AnyType peek() {
		if (stack.isEmpty()) {
			return null;
		} else {
			return stack.get(stack.size() - 1);
		}
	}

	public Boolean isEmpty() {
		if (stack.size() == 0) {
			return true;
		}

		else {
			return false;
		}
	}

	public String toString() {
		return stack.toString();
	}

}