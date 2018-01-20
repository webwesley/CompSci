package interfaces;

import java.io.File;
import java.io.FileNotFoundException;

public class BracketTester {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/interfaces/ValidBracketFile");
		ValidBracket test = new ValidBracket(file);
		test.printFile();
		System.out.println("This is using a valid file: " + test.isValidFile());
		System.out.println();
		File file2 = new File("src/interfaces/NOTVAlideFile");
		ValidBracket test2 = new ValidBracket(file2);
		test2.printFile();
		System.out.println("This is using a non-valid file: " + test2.isValidFile());
		System.out.println("Opening is:" + test.getOpening() + " and this is the Closer: " + test.getClosing());
	}

}
