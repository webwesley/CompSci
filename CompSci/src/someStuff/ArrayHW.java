package someStuff;

public class ArrayHW {

	public static void main(String[] args) {
		int[] noOnes = { 2, 4, 5 };
		int[] forThree = { 1, 3, 2 };
		int[] forFour = { 1, 1, 2, 4, 8 };
		int[] forFive = {2, 1, 2, 3};
		System.out.println(one(noOnes));
		System.out.println(two(noOnes));
		System.out.println(three(forThree));
		System.out.println(four(forFour));
		System.err.println(five(forFive));
	}

	private static boolean one(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == 1 || ints[i] == 3) {
				return false;
			}
		}
		return true;
	}

	private static boolean two(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] != 1 || ints[i] != 4) {
				return false;
			}
		}
		return true;
	}

	private static boolean three(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == 1) {
				for (int j = i + 1; j < ints.length; j++) {
					if (ints[j] == 2) {
						return true;
					}

				}

			}
		}
		return false;
	}

	private static boolean four(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] % 2 == 0) {
				if (ints[i + 1] % 2 == 0) {
					if (ints[i + 2] % 2 == 0) {
						return true;
					}
				}
			}
			if (ints[i] % 2 == 1) {
				if (ints[i + 1] % 2 == 1) {
					if (ints[i + 2] % 2 == 1) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private static boolean five(int[] ints) {
		for(int i = 0; i < ints.length; i++) {
			if(ints[i] + 1 == ints[i + 1]) {
				if(ints[i + 1] + 1 == ints[i + 2]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
