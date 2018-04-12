package interfaces;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack<E> implements Stack<E> {

	private ArrayList<E> stack;
	private int size;
	
	public ArrayListStack() {
		stack = new ArrayList<E>();
		size = 0;
	}
	
	
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(E x) {
		stack.add(size, x);
		
	}

	@Override
	public E pop() throws EmptyStackException {
		if(size == 0) {
			throw new EmptyStackException();
		}
		int tmp = size;
		size--;
		return stack.get(tmp);
	}

	@Override
	public E peekTop() {
		return stack.get(size);
	}

	@Override
	public int size() {
		return size;
	}

}
