package recursion;

public class Basics {

	public static void main(String[] args) {
		hanoi(2, "1", "2", "3");
	}

	public static int power(int base, int exp) {
		if (exp == 0) {
			return 1;
		}
		return base * power(base, exp - 1);
	}

	public static void hanoi(int n, String beg, String aux, String end) {
		if (n == 1) {
			System.out.println(beg + "--> " + end);
		} else {
			hanoi(n - 1, beg, end, aux);
			System.out.println(beg + "--> " + end);
			hanoi(n - 1, aux, beg, end);
		}
	}
}
