package anagramLab;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordList {
	String filename;
	int size;
	List<String> words;
	File file;

	public WordList() {
		this("src/anagramLab/TextFiles/small-words.txt", 10);
	}

	public WordList(String filename, int size) {
		this.filename = filename;
		this.size = size;
		this.file = new File(filename);
		this.words = new ArrayList<String>();

		try {
			Scanner input = new Scanner(file);
			int length = 1;
	
			for (int i = 0; i < length; i++) { //set array size here?
				if (input.hasNextLine()) {
					String tmp = input.nextLine();
					length++;
					if (tmp.length() <= size) {
						words.add(tmp.toLowerCase());
					}
				}
			}
			input.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void addWord(String word) {
		this.words.add(word);
	}
	
	public String toString() {
		return Arrays.toString(this.words.toArray());
	}
	
	public List<String> findAnagrams(Word word) {
		List<String> anagrams = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			if (word.isAnagram(words.get(i))) {
				anagrams.add(words.get(i));
			}
		}
		return anagrams;
	}
}
