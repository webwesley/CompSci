package assignment3;

public class Tester {
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(3);
		Rectangle rect3 = new Rectangle(4,5);
		
		System.out.println("Is this rectangle a square: " + rect1.isSquare());
		System.out.println("Is this rectangle a square: " + rect2.isSquare());
		System.out.println("Is this rectangle a square: " + rect3.isSquare());
		
		rect3.quadratize();
		System.out.println("Rect3 has been quadratized");
		System.out.println("Is this rectangle a square: " + rect3.isSquare());
		System.out.println();
		Time t1 = new Time(12, 40);
		Time t2 = new Time(14, 35);
		Time t3 = new Time(10, 2);
		System.out.println("Is t1 < t2? " + t1.lessThan(t2));
		System.out.println("Time elapsed since t2 to t1: " + t1.elapsedSince(t2));
		System.out.println("Time elapsed since t3 to t1: " + t1.elapsedSince(t3));
		
		
	}

}
