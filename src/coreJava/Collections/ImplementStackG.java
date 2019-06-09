package coreJava.Collections;

import java.lang.reflect.Array;

/**
 * @author naveen.singh
 *
 * 
 */
public class ImplementStackG {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.size());
		stack.pop();
		System.out.println(stack.peek());
	}
}

class Stack<T> {
	private T arr[];
	private int top;
	private int capacity;
	private static int DEFAULT_SIZE = 10;

	@SuppressWarnings("unchecked")
	public Stack() {
		this((Class<T>) Object.class);
		top=-1;
	}

	@SuppressWarnings("unchecked")
	public Stack(Class<T> c) {
		this.capacity=DEFAULT_SIZE;
		this.arr = (T[]) Array.newInstance(c, capacity);
		top=-1;
	}

	@SuppressWarnings("unchecked")
	public Stack(Class<T> c, int size) {
		this.capacity=size;
		this.arr = (T[]) Array.newInstance(c, capacity);
	}

	public boolean push(T item) {
		if (!isFull()) {
			this.arr[++top] =item;
			return true;
		} else {
			return false;
		}
	}

	public T peek() {
		return this.arr[top];
	}

	public T pop() {
		if (isEmpty()) {
			return arr[top];
		} else {
			return arr[top--];
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
