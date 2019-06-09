package coreJava.Collections;

/**
 * @author naveen.singh
 *
 * 
 */
public class ImplementStack {

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<String>(4);
		stack.push("neo");
		stack.push("naveen");
		stack.push("rahul");
		System.out.println(stack.size());
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

	}

}

class MyStack<T> {
	private Object arr[];
	private int top;
	private int capacity;

	MyStack(int size) {
		arr = new Object[size];
		capacity = size;
		top = -1;
	}

	public boolean push(T item) {
		if (!isFull()) {
			arr[++top] = item;
			return true;
		} else {
			return false;
		}
	}

	public boolean pop() {
		if (isEmpty()) {
			return false;
		} else {
			--top;
			return true;
		}

	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}
}