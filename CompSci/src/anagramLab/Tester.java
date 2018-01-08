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
		while (true) { //while loop keeps it going until the user inputs finish
			System.out.print("Enter a word: ");
			Word word = new Word(input.next());
			if (word.initial.equals("finish")) {
				System.out.println("\nThank You For Your Time");
				break;
			}
			System.out.println("Anagrams:" + Arrays.toString(wordList.findAnagrams(word).toArray()));

		}
		input.close();
		System.out.println("The word banna was added to the word list");
		wordList.addWord("Banna");
	}
	


}

// src/anagramLab/TextFiles/dictionary.txt