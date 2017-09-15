package someStuff;

public class IfElseStatements {
	
	public static void main(String[] args) {
		int num = 6;
		if(num > 8) {
			System.out.println("Nine, Ten, lets eat some large hen !");
		} else if (num > 6) {
			System.out.println("Seven, Eight, fish like to eat bait");
		} else if(num > 4) {
			System.out.println("Five, Six, I ate some bisquix");
		} else if(num > 2) {
			System.out.println("Three, Four, I don't have a door");
		} else {
			System.out.println("One, Two, Eat a Mushroom");
		}
	}

}
