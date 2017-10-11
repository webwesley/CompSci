package guis;


public class TesterClass {

	public static void main(String[] args) {
		ChoseYourOwnAdventure first = new ChoseYourOwnAdventure("This is a test", "This is a title");
		ChoseYourOwnAdventure second = new ChoseYourOwnAdventure("This is another test", "This is another title");
		ChoseYourOwnAdventure test = new ChoseYourOwnAdventure("This is the ultimate test", "This is the test title", first, second);
		test.draw();
	}

}
