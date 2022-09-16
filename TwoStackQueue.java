public class TwoStackQueue<AnyType> {
	private MyStack<AnyType> inputStack;
	private MyStack<AnyType> outputStack;
	private AnyType n;
	private int size;

	public TwoStackQueue() {
		inputStack = new MyStack<>();
		outputStack = new MyStack<>();
	}

	public void enqueue(AnyType n) {
		inputStack.push(n);
		size++;
	}

	public AnyType dequeue() {
		AnyType t = null;

		if (outputStack.isEmpty())

			while (!inputStack.isEmpty()) {
				n = inputStack.pop();
				outputStack.push(n);
			}
		if (!outputStack.isEmpty()) {
			t = outputStack.pop();
			size--;

		}
		return t;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}