package interfaces;

public class ArrayStack<E> implements Stack<E> {

	private Object[] stk;
	private int size;

	public ArrayStack() {
		stk = new Object[10];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(E x) {
		// TODO Auto-generated method stub

	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekTop() {
		// TODO Auto-generated method stub
		return null;
	}

}
