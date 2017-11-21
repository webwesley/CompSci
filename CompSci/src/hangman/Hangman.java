package hangman;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Scanner;

import javax.swing.*;

//Hangman Lab.
@SuppressWarnings("serial")
public class Hangman extends JPanel {
	String word;
	String blank;
	StringBuffer rightGuess;
	String wrongGuess;
	String difficulty;
	Draw draw;
	int numOfGuesses;

	public Hangman(String word) { //constriuctor, takes in a word, sets up 
		this.word = word.toLowerCase();
		this.blank = "";
		this.wrongGuess = "";
		this.difficulty = "";
		rightGuess = new StringBuffer(word.length() * 2 + 1);
		for (int i = 0; i < word.length(); i++) {
			this.rightGuess.append("  ");
			this.blank += "_ ";
		}
		this.word.toLowerCase();

	}

	public Hangman() {
		this("communism");
	}

	public void run() { //runs hangman lab

		Scanner input = new Scanner(System.in);
		setDifficulty(input);
		createFrame();
		while (numOfGuesses > 0) {
			guess(input);
		}
		input.close();
	}

	private void createFrame() { //sets up the frame
		JFrame frame = new JFrame();
		frame.setSize(400, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(draw);
		draw.setVisible(true);
		Graphics g = draw.getGraphics();
		draw.paint(g);

	}

	private void guess(Scanner input) { //executes every guess iteration 
		if(numOfGuesses == 0) {
			System.out.println("you lost");
			return;
		}
		System.out.println(rightGuess);
		System.out.println(blank);
		System.out.println("These are all the letters you guessed: " + this.wrongGuess);
		System.out.print("Do You Want To Guess the Word? (Y/N) ");
		if (input.nextLine().toLowerCase().equals("y")) {
			System.out.print("Guess: ");
			String tmp = input.nextLine();
			if (tmp.toLowerCase().equals(word)) {
				win();
				numOfGuesses = 0;
				return;
			}
			wrongGuess();

		}
		System.out.print("Please Make Your Guess: of a letter: ");
		String guess = input.nextLine().toLowerCase();
		while (guess.length() != 1) {
			System.out.println("You Fool! Make a Guess: ");
			guess = input.nextLine().toLowerCase();
		}
		if (!word.contains(guess)) {
			if (wrongGuess.length() >= 1) {
				wrongGuess += (", " + guess);
			} else {
				wrongGuess += (guess);
			}
			wrongGuess();
			return;
		}
		int j = 0;
		if (wrongGuess.contains(guess)) {
			System.out.println("You already guessed that letter");
			wrongGuess();
		}
		if (wrongGuess.length() >= 1) {
			wrongGuess += (", " + guess);
		} else {
			wrongGuess += (guess);
		}

		while (word.indexOf(guess, j) != -1) {
			int index = word.indexOf(guess, j);
			this.rightGuess.replace(index * 2, index * 2 + 1, guess);
			j = index + 1;

		}
		String tmp = "";
		for (int i = 0; i < this.rightGuess.length(); i += 2) {
			tmp += this.rightGuess.substring(i, i + 1).trim();
			if (tmp.equals(word)) {
				win();
				return;
			}
		}
	}

	private void win() { //win condition
		System.out.println("Congrats you won!");
	}

	private void wrongGuess() { //wrong guess, re draws the panel
		System.out.println("We are sorry. That was a terrible guess.");
		draw.removeLife();
		draw.repaint();

	}

	private void setDifficulty(Scanner input) { //sets difficulty based on user input
		boolean tmp = true;
		while (tmp) {
			System.out.print("What difficulty do you want: (E/M/H) ");
			difficulty = input.nextLine().toLowerCase();
			if (difficulty != "e" || difficulty != "m" || difficulty != "h") {
				switch (difficulty) {
				case "e":
					this.numOfGuesses = 8;
					this.draw = new Draw(numOfGuesses);
					break;
				case "m":
					this.numOfGuesses = 6;
					this.draw = new Draw(numOfGuesses);
					break;
				case "h":
					this.numOfGuesses = 4;
					this.draw = new Draw(numOfGuesses);
					break;
				}
				System.out.println("Difficultly set to: " + difficulty); // make this pretty
				tmp = false;
			} else {
				System.out.println("You did not specify a difficulty. You will be asked again \n");
			}
		}
	}
}
