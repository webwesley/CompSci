package interfaces;

public class ExpressioTester {
	
		public static void main(String[] args) {
			String expression = "()()";
			Expression test = new Expression(expression, "(", ")");
			System.out.println("Is Your Expressions \"" + expression + "\" Valid? " + test.validExpression());
			System.out.println();
			expression = ")()(";
			test = new Expression(expression, "(", ")");
			System.out.println("Is Your Expressions \"" + expression + "\" Valid? " + test.validExpression());
			
		}
	}

