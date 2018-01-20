package interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ValidBracket implements Validity {

	private String fileString = "";
	private Expression express;
	private String OPENER = "{";
	private String CLOSER = "}";

	public ValidBracket(File file) throws FileNotFoundException {
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			this.fileString += input.next();
		}
		this.express = new Expression(fileString, OPENER, CLOSER);
		input.close();
	}

	@Override
	public boolean isValidFile() {
		return express.validExpression();
	}

	@Override
	public void printFile() {
		System.out.println(fileString);
	}

	@Override
	public String getOpening() {
		return OPENER;
	}

	@Override
	public String getClosing() {
		return CLOSER;
	}

}
