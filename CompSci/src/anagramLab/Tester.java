package anagramLab;

public class Tester {
	public static void main(String[] args) {
		Words duck = new Words("duck");
		System.out.println(duck.initial);
		System.out.println(duck.sorted);
		System.out.println(duck.isAnagram("cuk"));
	}
}
