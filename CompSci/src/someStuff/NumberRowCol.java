package someStuff;

public class NumberRowCol {

	public static void main(String[] args0) {
		int row = 1000;
		int col = 1000;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print((i * j) % 10);
			}
			System.out.println();
		}
	}

}
