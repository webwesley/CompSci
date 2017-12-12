package fortuneCookies;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FCArrayList {
	ArrayList<FortuneCookie> fortunes;
	File file;

	public FCArrayList() {
		fortunes = new ArrayList<FortuneCookie>();
		file = new File("/home/waford/Downloads/fortunes.txt");
		makeList();

	}

	private void makeList() { //makes the list using a scanner
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				fortunes.add(new FortuneCookie(input.nextLine()));
				try {
				input.nextLine(); 
				} catch (NoSuchElementException e) {}
				
						}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getFortune(int i) { // gets fortune at i
		return fortunes.get(i).toString();
	}

	public String peek() {
		return getFortune(0);
	}

	public String remove(int i) {
		String tmp = fortunes.get(i).toString(); // removes fortune at i
		fortunes.remove(i);
		return tmp;
	}

	public String poll() {
		return remove(0);
	}

	public String toString() {
		return Arrays.toString(fortunes.toArray());
	}

	public void add(String fortune, int i) { // adds a fortune
		fortunes.add(i, new FortuneCookie(fortune));
	}
	
	public int size() {
		return fortunes.size();
	}

}
