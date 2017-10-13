package guis;


public class TesterClass {

	public static void main(String[] args) {
		ChoseYourOwnAdventure firstEnd = new ChoseYourOwnAdventure("Congragulations! Mr. Howard decided that you really are a good students, and that + "
				+ "given the circumstances of the situation, deserve one point back. You manage to get into college", "Actually write a *thought provoking and meaningful essay for once \n *As deemed by the council of Hieberts");
		ChoseYourOwnAdventure secondEnd = new ChoseYourOwnAdventure("This is another test", "This is another title");
		ChoseYourOwnAdventure test = new ChoseYourOwnAdventure("This is the ultimate test", "This is the test title", firstEnd, secondEnd);
		test.draw();
	}

}
