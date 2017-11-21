package someStuff;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		String[] test = { "Who", "is", "a", "communist" };
		System.out.println(Arrays.toString(test));
		for (String str : test) {
			if (str.equals("Who")) {
				System.out.println("True");
				str = "James Howard";
				System.out.println(str);
			}
		}
		System.out.println(Arrays.toString(test));
		test[0] = "James Howard";
		System.out.println(Arrays.toString(test));
	}

}
