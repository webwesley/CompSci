package ATCS;

public class Stars {

	public void printStars(int n) {
		String spaces = " ";
		String stars = "*";
		int numStars = (2 * (n - 1)) + 1;
		for(int i = 0; i < numStars / 2; i++) {
			spaces += " ";
		}
		for(int i = 0; i < n; i++) {
			spaces = spaces.substring(1);
			System.out.print(spaces);
			System.out.print(stars);
			System.out.println();
			stars += "**";
		}
	}
}
