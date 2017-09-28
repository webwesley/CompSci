package ATCS;

public class TesterACTS {
	
	public static void main(String[] args) {
		CoinCombos coins = new CoinCombos();
		coins.allCoins(25);
		System.out.println();
		BePrepared be = new BePrepared();
		System.out.println("Cost for books:" + be.calculateOrder(1, 1));
		System.out.println("Cost for books:" + be.calculateOrder(2, 1));
		System.out.println("Cost for books:" + be.calculateOrder(5, 7));
		
		System.out.println();
		Fraction frac = new Fraction();
		System.out.println("This is the closet fraction above 17/76: " + frac.above());
		System.out.println("This is the closet fraction below 17/76: " + frac.below());
		
		System.out.println();
		Stars stars = new Stars();
		stars.printStars(5);
		
		System.out.println();
		MVT mvt = new MVT();
		System.out.println("The quadractic Function equals: " + mvt.function(1, 1, 1, 2));
		System.out.println("The Mean Value Therom equals: " + mvt.fPrime(1, 1, 1, 2, 3));
	}

}
