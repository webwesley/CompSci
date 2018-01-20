package interfaces;

import java.util.EmptyStackException;

public class Expression {

	private String myExpression;
	private String OPENER;
	private String CLOSER;

	public Expression(String expression, String opener, String closer) {
		myExpression = expression;
		OPENER = opener;
		CLOSER = closer;
	}

	public boolean validExpression() {
		ArrayStack<String> stackOne = new ArrayStack<String>();
		for (int i = 0; i < myExpression.length(); i++) {  //creates a stack with all the openers and closers in order
			if (Character.toString(myExpression.charAt(i)).equals(OPENER)) {
				stackOne.push(OPENER);
			}
			if (Character.toString(myExpression.charAt(i)).equals(CLOSER)) {
				stackOne.push(CLOSER);
			}
		}
		
		if(stackOne.peekTop().equals(OPENER)) { //makes sure no brackets proceed a closer
			return false;
		}
		int openExpecting = 0;			//how many open brackets are expected
		try { 
			while(!stackOne.isEmpty()) {
				if(stackOne.pop().equals(CLOSER)) {
					openExpecting++;
				}
				if(stackOne.pop().equals(OPENER)) {
					openExpecting--;
				}
			}
		} catch (EmptyStackException e) { //if that happens, it means there was an odd amount of openers/closers. thats a nono
			return false;
		}
		return openExpecting == 0;
	}
}
