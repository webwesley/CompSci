package anagramLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tester {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("File Name: ");
		String filename = input.nextLine();
		System.out.print("Max Length of Words: ");
		int size = input.nextInt();
		input.reset();
		WordList wordList = new WordList(filename, size);
		while (true) {
			System.out.print("Enter a word: ");
			Word word = new Word(input.next());
			if (word.initial.equals("finish")) {
				System.out.println("\n Thank You For Your Time");
				break;
			}
			System.out.println("\n" + Arrays.toString(wordList.findAnagrams(word).toArray()));

		}
		input.close();
	}


}

// src/anagramLab/TextFiles/dictionary.txt