package fractionLab;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction test1 = new Fraction(3, 4);
		Fraction test2 = new Fraction();
		System.out.println("The fractions so far are: " + test1.printFraction() + " and " + test2.printFraction());
		System.out.println("This is a staic method test: Fraction 1 + Fraction 2 is: " + Fraction.addFraction(test1, test2).printFraction());
		test2.addFraction(test1);
		System.out.println("Fraction 2 added to fraction 1 is: " + test2.printFraction());
		System.out.println("Fraction 2 is now equal to: " + test2.printFraction());
		System.out.println("This is a staic method test: Fraction 1 * Fraction 2 is: " + Fraction.multFraction(test1, test2).printFraction());
		test2.multFraction(test1);
		System.out.println("Fraction 2 * Fraction 1 is: " + test2.printFraction());
		System.out.println("Fraction 2 is now equal to: " + test2.printFraction());
		System.out.println("This is a staic method test: Fraction 1 / Fraction 2 is: " + Fraction.divideFraction(test1, test2).printFraction());
		test1.divideFraction(test2);
		System.out.println("Fraction 1 / Fraction 2 = " + test1.printFraction());
		System.out.println("Fraction 1 is now :" + test1.printFraction());	
		Fraction test3 = new Fraction(4, 5);
		System.out.println("Is Fraction 1 equal to Fraction 3: " + test1.isEquals(test3));
		System.out.println("What fraction is larger, Fraction 1, or Fraction 2: " + test1.compare(test2).printFraction());
		System.out.println("What is the numerator of Fraction 1: " + test1.getNumerator());
		System.out.println("What is the numerator of Fraction 1: " + test1.getDenominator());	
		System.out.println("The decimal form of Fraction 1 is: " + test1.getDecimal());
		

	}

}
