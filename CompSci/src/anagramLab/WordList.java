package anagramLab;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class WordList {
	String filename;
	int size;
	String[] words;
	File file;

	public WordList() {
		this("src/anagramLab/TextFiles/small-words.txt", 24);
	}

	public WordList(String filename, int size) {
		this.filename = filename;
		this.size = size;
		this.file = new File(filename);
		try {
			words = new String[2000];
			Scanner input = new Scanner(file);

			for (int i = 0; i < size; i++) { //set array size here?
				if (input.hasNextLine()) {
					if (input.nextLine().length() <= size) {
						words[i] = input.nextLine();
					}
				}
			}
			input.close();
		} catch (

		Exception e) {
			System.out.println(e);
		}

	}
}

// class test {
// public static void main(String[] args) {
// WordList test = new WordList();
// System.out.println(Arrays.toString(test.words));
//
// }
// }
