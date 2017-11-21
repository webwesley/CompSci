package arrayGroupWork;

public class Polynomial {
	private double[] coEfficents;

	public Polynomial(double[] a) {
		this.coEfficents = a;
	}

	public int degree() { //relativly simple... the degree of a function is going the be the length of the array minus one
		return (coEfficents.length - 1);
	}

	public double getValue(double x) { //uses basic arithmatic to return a value for the function at x
		double value = 0;
		for (int i = 0; i < coEfficents.length; i++) {
			value += coEfficents[i] * Math.pow(x, i);
		}
		return value;
	}

	public String toString() {
		String polynomial = "";
		for (int i = 0; i < coEfficents.length - 1; i++) {

			polynomial += (coEfficents[i] + "(x^" + i + ") + ");
		}
		polynomial += (coEfficents[coEfficents.length - 1] + "(x^" + (coEfficents.length - 1) + ")");
		return polynomial;
	}

	public double getBetterValue(double x) { //uses a more effiecnt alorithimn to get a value for the function at x
		double sum = 0;
		if (coEfficents.length > 1) {
			for (int i = coEfficents.length - 1; i > 0; i--) {
				sum = x * (sum + coEfficents[i]);
			}
		}
		return coEfficents[0] + sum;
	}

	public Polynomial multiply(Polynomial other) {
		/*
		this ones kind of tricky. First, the algorithm creates two arrays of the same size
		then it fills one with the products of each distinct element of the two functions. The second array is to keep track of the powers
		the value of each index in the degree array corresponds to the degree of the coefficient of the same index. That becomes important later
		later is now. A new array is created to hold a simplified version of the function to create the return polynomial.
		To make this array correct, we take at variable i. Now we take the degree at i from the degree array, and set the return array at that value 
		that degree returned equal to the value of the coeffienct at i. It's propbalby easier to look at the code.  
		*/
		double[] products = new double[this.coEfficents.length * other.coEfficents.length];
		int[] degree = new int[this.coEfficents.length * other.coEfficents.length];
		int index = 0;
		for (int i = 0; i < this.coEfficents.length; i++) {
			for (int j = 0; j < other.coEfficents.length; j++) {
				products[index] = this.coEfficents[i] * other.coEfficents[j];
				degree[index] = i + j;
				index++;
			}
		}
		double[] returnValue = new double[(this.coEfficents.length + other.coEfficents.length) - 1];
		for (int i = 0; i < products.length; i++) {
				returnValue[degree[i]] += products[i];
		}

		return new Polynomial(returnValue);
	}

}
