package arrayGroupWork;

public class Polynomial {
	private double[] coEfficents;

	public Polynomial(double[] a) {
		this.coEfficents = a;
	}

	public int degree() {
		return (coEfficents.length - 1);
	}

	public double getValue(double x) {
		double value = 0;
		for (int i = 0; i < coEfficents.length; i++) {
			value += coEfficents[i] * Math.pow(x, i);
		}
		return value;
	}

	public String toString() {
		String polynomial = "";
		for (int i = 0; i < coEfficents.length; i++) {
			polynomial += (coEfficents[i] + "x^" + i + " ");
		}
		return polynomial;
	}

	public double getBetterValue(double x) {
		double sum = 0;
		if (coEfficents.length > 1) {
			for (int i = coEfficents.length - 1; i > 0; i--) {
				sum = x * (sum + coEfficents[i]);
			}
		}
		return coEfficents[0] + sum;
	}
	
	public Polynomial multiply(Polynomial other) {
		double[] products = new double[this.coEfficents.length * other.coEfficents.length];
		int[] degree = new int[this.coEfficents.length * other.coEfficents.length];
		int index = 0;
		for(int i = 0; i < this.coEfficents.length; i++) {
			for(int j = 0; j < other.coEfficents.length; j++) {
				products[index]= this.coEfficents[i] * other.coEfficents[j];
				degree[index] = i + j;
				index++;
			}
		}
		double[] returnValue = new double[this.coEfficents.length + other.coEfficents.length];
		for(int i = 1; i < (this.coEfficents.length + other.coEfficents.length); i++) {
			for(int j = 1; j < degree.length; j++) {
				if(i == degree[j]) {
					returnValue[i] = products[i] + products[j];
				}
			}
		}
		return new Polynomial(returnValue);
	}

}
