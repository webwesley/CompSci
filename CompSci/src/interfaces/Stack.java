package interfaces;

import java.util.EmptyStackException;

public interface Stack<E> {
	
	boolean isEmpty();
	
	/**
	 * precondition: stack is [e1, e2, ..., en] with n>=0
	 * postcondition: stack is[e1, e2, ..., en, x] 
	 */
	void push(E x);
	
	
	
	/**
	 * preconditon: stack is [e1, e2, .., en] with n >= 1
	 * postconditon: stack is [e1, e2, ..., e(n-1)]; returns en
	 * exceptions: throws an unchecked exception if the stack is empty
	 */
	E pop() throws EmptyStackException;
	
	/**
	 * preconditi
	 * postcondition I cant type that fast
	 */
	
	E peekTop();
	
	int size(); //retunrs the number of elemnts currently in the stack
}
