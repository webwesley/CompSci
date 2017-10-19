package fractionLab;

//this lab contians the contents of a fraction, as well as all apporpriet methods and some static methods. 

public class Fraction {
	int numerator;
	int denominator;

	//decimal constructor
	public Fraction(double dec) {
		if(dec != 0) {
		int tmp = Double.toString(dec).length() - 1;
		this.numerator = (int) (Math.pow(10, tmp) * (dec));
		this.denominator = (int) Math.pow(10, tmp);
		} else {
			System.out.println("Nope");
		}
	}
	//numerator constructor out of 2
	public Fraction(int numerator) {
		if(numerator != 0 ) {
		this.numerator = numerator;
		} else {
			System.out.println("Nope");
		}
		this.denominator = 2;
	}
	// numerator and denominator constructor
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator >= 1) {
			this.denominator = denominator;
		} else {
			System.out.println("The denominator needs to be greater than 1");
		}
	}
	//empty constructor
	public Fraction() {
		this.numerator = 1;
		this.denominator = 2;
	}
	//static addFraction
	public static Fraction addFraction(Fraction one, Fraction two) {
		return (simplify (new Fraction((one.numerator * two.denominator) + (two.numerator * one.denominator),
				(one.denominator * two.denominator))));
	}
	//static multFraction
	public static Fraction multFraction(Fraction one, Fraction two) {
		return (simplify(new Fraction(one.numerator * two.numerator, one.denominator * two.denominator)));
	}
	//static divideFraction
	public static Fraction divideFraction(Fraction one, Fraction two) {
		return (simplify(new Fraction(one.numerator * two.denominator, one.denominator * two.numerator)));
	}
	
	public void addFraction(Fraction add) {
		this.numerator = (addFraction(this, add)).numerator;
		this.denominator = (addFraction(this, add)).denominator;
		//simplify();
	}

	public void multFraction(Fraction mult) {
		this.numerator = (multFraction(this, mult)).numerator;
		this.denominator = (multFraction(this, mult)).denominator;
		simplify();
	}

	public void divideFraction(Fraction div) {
		Fraction tmp = (divideFraction(this, div));
		this.numerator = tmp.numerator;
		this.denominator = tmp.denominator;
		simplify();
	}
	
	public boolean isEquals(Fraction equal) {
		if (simplify(this).equals(simplify(equal))) {
			return true;
		} else {
			return false;
		}
	}
	
	public Fraction compare(Fraction tmp) {
		if(this.numerator / this.denominator > tmp.numerator / tmp.denominator ) {
			return this;
		} else {
			return tmp;
		}
	}
	
	public int getNumerator() {
		return(this.numerator);
	}

	public int getDenominator() {
		return this.denominator;
	}
	
	public String printFraction() {
		return(this.numerator + "/" + this.denominator);
	}

	public double getDecimal() {
		return ((double) this.numerator / (double) this.denominator);
	}
	//simplify uses gcf method to simplyt the fraction
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
