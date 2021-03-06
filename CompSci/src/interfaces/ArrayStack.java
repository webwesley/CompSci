package interfaces;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {

	private Object[] stk;
	private int size;

	public ArrayStack() {
		stk = new Object[10];
		size = 0;
		
	}
	
	public ArrayStack(int size) {
		stk = new Object[size];
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	
	@Override
	public void push(E x) {
		if(size == stk.length) {
			stk = Arrays.copyOf(stk, 2*size);
		}
		stk[size] = x;
		size++;
	}


	@SuppressWarnings("unchecked")
	@Override
	public E pop() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		size--;
		E tmp = (E) stk[size];
		return tmp;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peekTop() {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		return (E) stk[size - 1];
	}

	@Override
	public int size() {
		return size;
		}

	
}
