package ATCS;

public class TesterACTS {
	
	public static void main(String[] args) {
		Fraction frac = new Fraction();

		System.out.println("This is the closet fraction above 17/76: " + frac.above());
		System.out.println("This is the closet fraction below 17/76: " + frac.below());
		
	}

}
