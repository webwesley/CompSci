package fractionLab;

public class Fraction {
	int numerator;
	int denominator;

	public Fraction(double dec) {
		int tmp = Double.toString(dec).length() - 1;
		this.numerator = (int) (Math.pow(10, tmp) * (dec));
		this.denominator = (int) Math.pow(10, tmp);
	}

	public Fraction(int numerator) {
		this.numerator = numerator;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator < 2) {
			this.denominator = denominator;
		} else {
			System.out.println("The denominator needs to be greater than 1");
		}
	}

	public Fraction() {
		this.numerator = 1;
		this.denominator = 2;
	}

	public static Fraction addFraction(Fraction one, Fraction two) {
		return (simplify(new Fraction((one.numerator * two.denominator) + (two.numerator * two.denominator),
				(one.denominator * two.denominator))));
	}

	public static Fraction multFraction(Fraction one, Fraction two) {
		return (simplify(new Fraction(one.numerator * two.numerator, one.denominator * two.denominator)));
	}

	public static Fraction divideFraction(Fraction one, Fraction two) {
		return (simplify(new Fraction(one.numerator * two.denominator, one.denominator * two.denominator)));
	}

	public void addFraction(Fraction add) {
		this.numerator = (addFraction(this, add)).numerator;
		this.denominator = (addFraction(this, add)).denominator;
		simplify();
	}

	public void multFraction(Fraction mult) {
		this.numerator = (multFraction(this, mult)).numerator;
		this.denominator = (multFraction(this, mult)).denominator;
		simplify();
	}

	public void divideFraction(Fraction div) {
		this.numerator = (divideFraction(this, div)).numerator;
		this.denominator = (divideFraction(this, div)).denominator;
		simplify();
	}

	public boolean isEquals(Fraction equal) {
		if (simplify(this).equals(simplify(equal))) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Fraction compare(Fraction one, Fraction two) {
		if(one.compareTo(two) )
	}
	
	public int getNumerator() {
		return(this.numerator);
	}

	private static Fraction simplify(Fraction simp) {
		int gcf = gcf(simp.numerator, simp.denominator);
		return (new Fraction(simp.numerator / gcf, simp.denominator / gcf));
	}

	private static int gcf(int n, int d) {
		if (n <= 0 || d <= 0) {
			throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);
		}

		if (n % d == 0) {
			return d;
		} else if (d % n == 0) {
			return n;
		} else {
			return gcf(n % d, d % n);
		}
	}

	private void simplify() {
		this.numerator = simplify(this).numerator;
		this.denominator = simplify(this).denominator;
	}

}
