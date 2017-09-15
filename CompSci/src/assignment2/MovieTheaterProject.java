package assignment2;

public class MovieTheaterProject {

	public static void main(String[] args) {
		boolean parent = true;
		int age = 178;
		int condition = 0;
		String show = "Evening";
		if(age < 16 && age >= 13) {
			condition = 1;
		} else if(age >= 16) {
			condition = 2;
		}
		switch(condition) {
		case 0:
			if(parent) {
				System.out.println("G, PG");
			} else {
				System.out.println("G");
			}
			break;
		case 1:
			if(parent) {
				System.out.println("G, PG, R");
			} else {
				System.out.println("G, PG");
			}
			break;
		default:
			System.out.println("G, PG, R");
		}
		if(show == "Matinee") {
			System.out.println("Price:$7.50");
		} else {
			System.out.println("Price:$10.50");
		}
	}

}
