package item06;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackFix {
	private Object[] elements;
	private int size;
	private final static int DEFAULT_INITIAL_CAPACITY = 16;

	public StackFix() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * elements.length * 2 + 1);
	}
}
