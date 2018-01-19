package interfaces;

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
		for (int i = 0; i < myExpression.length(); i++) {
			if (Character.toString(myExpression.charAt(i)).equals(OPENER)) {
				stackOne.push(OPENER);
			}
			if (Character.toString(myExpression.charAt(i)).equals(CLOSER)) {
				stackOne.push(CLOSER);
			}
		}
	}
}
