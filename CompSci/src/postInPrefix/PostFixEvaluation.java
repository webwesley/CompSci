package postInPrefix;

import java.util.Scanner;

import interfaces.ArrayStack;

public class PostFixEvaluation extends ArrayStack<String> implements Comparable<PostFixEvaluation> {

	private String postFix;
	Double answer;
	boolean error; //will turn true if there is an error

	public PostFixEvaluation(String postFix) {
		this.postFix = postFix;
		this.error = false;
		errorCheckAndAdd();
		if(this.error) {
		evaluate();
		}
	}

	public double getAnswer() { //will throw nullpointer exception if there is an invalid expression
		try {
		return this.answer;
		} catch(NullPointerException e) {
			System.out.println("Sorry, there is not a valid function in this object");
			throw(e);
		}
	}

	private void evaluate() { // evealuates the expression
		while(this.size() != 1) {
		ArrayStack<String> holder = new ArrayStack<String>();
		String operation = "";
		int numInts = 0;
		while(numInts != 2) {
			if(this.peekTop().equals("+") || this.peekTop().equals("-") || this.peekTop().equals("*") || this.peekTop().equals("/")) {
				operation = this.peekTop();
				holder.push(this.pop());
				numInts = 0;
			} else {
				holder.push(this.pop());
				numInts++;
			}
		}
		String one = holder.pop();
		String two = holder.pop();
		holder.pop();
		switch(operation) {
		case "+": holder.push(Double.toString((Double.parseDouble(one) + Double.parseDouble(two))));
			break;
		case "-": holder.push(Double.toString((Double.parseDouble(one) - Double.parseDouble(two))));
			break;
		case "*": holder.push(Double.toString((Double.parseDouble(one) * Double.parseDouble(two))));
			break;
		case "/": holder.push(Double.toString((Double.parseDouble(one) / Double.parseDouble(two))));
			break;
			}
		reset(holder);
		
		}
		this.answer = Double.parseDouble(this.pop());
		
	}

	private void reset(ArrayStack<String> holder) { //resets the stack so it can reevaluate it
		while(!this.isEmpty()) {
			holder.push(this.pop());
		}
		while(!holder.isEmpty()) {
			this.push(holder.pop());
		}
		
	}

	private void errorCheckAndAdd() { // checks for errors and adds emelmesnt to the stack
		int nums = 0;
		int operations = 0;
		Scanner scan = new Scanner(this.postFix);
		while (scan.hasNext()) {
			String tmp = scan.next();
			if ((tmp.contains("+")) || (tmp.contains("-")) || (tmp.contains("*")) || (tmp.contains("/"))) {
				operations++;
				push(tmp);
				continue;
			} else {
				try {
					Integer.parseInt(tmp);
					nums++;
				} catch (Exception e) {
					System.out.println(
							"That is not an valid string. Please make sure every seperate element is seperated by a space");
					scan.close();
					return;
				}
			}
			push(tmp);
		}
		if (nums - operations != 1) {
			System.out.println(
					"That is not an valid string. Please make sure every seperate element is seperated by a space");
			scan.close();
			return;
		}
		scan.close();
		this.error = true;

	}
	
	public String toString() {
		return "Original: " + postFix + ", Result: " + answer;
	}

	public String infixToPostFix(String infix) {
		for(int i = infix.length() - 1; i >= 0; i--) {
			if(infix.charAt(i) == '+' || infix.charAt(i) == '-') {
				char operation = infix.charAt(i);
				String before = infix.substring(0, i);
				String after = infix.substring(i+2, infix.length());
				infix = before + after + " " + operation;
			} else if(infix.charAt(i) == '*' || infix.charAt(i) == '/') {
				infix += " ";
				char operation = infix.charAt(i);
				for(int j = i + 2; j < infix.length(); j++) {
					if(infix.charAt(j) == ' ') {
						String before = infix.substring(0, i);
						String middle = infix.substring(i + 2, j); 
						String end = infix.substring(j, infix.length());
						infix = before + middle + " " + operation + end;
						infix.trim();
						break;
					}
				}
			}
		}
		return infix;
	}
	
	
	@Override
	public int compareTo(PostFixEvaluation o) {
		if(this.answer - o.getAnswer() < 0) {
			return -1;
		} else if (this.answer - o.getAnswer() == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		String postFix = "2 2 2 * 5 + +";
		System.out.println("Trying: " + postFix);
		PostFixEvaluation test = new PostFixEvaluation(postFix);
		System.out.println("Answer:" + test.getAnswer()); 
		System.out.println(test.toString());
		String infix = "5 * 2 / 6 + 3 - 6";
		System.out.println("Original infix: " + infix);
		System.out.println("Converted to postFix: " + test.infixToPostFix(infix));
 
	}

}
