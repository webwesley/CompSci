package assignment2;

public class LeapYear {

	public static void main(String[] args) {

		int year = 400;
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("Is a leap year");
					return;
				}
				System.out.println("Is ot a leap year");
				return;
			}
			System.out.println("Is a leap year");
		} else {
			System.out.println("Is not a leap year");
		}
	}
}
