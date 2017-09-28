package ATCS;

//a program that finds the two such fractions that are closest to 17 / 76:
//one from above and one from below.

public class Fraction {
	double numTest;
	double demTest;
	double target;

	public Fraction() {
		this.numTest = 17;
		this.demTest = 76;
		this.target = (numTest / demTest);
	}

	public String above() {
		
		double difference = 1;
		double numBest = 0;
		double demBest = 0;
		for (demTest = 1; demTest < 100; demTest++) {
			for (numTest = 1; numTest < 100; numTest++) {
				double tmp = (numTest / demTest) - target;
				if (tmp < difference && (numTest / demTest - target) > 0) {
					numBest = numTest;
					demBest = demTest;
					difference = tmp;
					continue;
				}
			
				}
			}

		return((int) numBest + "/"  + (int) demBest);

	}

public String below() {
		
		double difference = 1;
		double numBest = 0;
		double demBest = 0;
		for (demTest = 100; demTest > 0; demTest--) {
			for (numTest = 100; numTest > 0; numTest--) {
				double tmp = target - (numTest / demTest);
				if (tmp < difference && tmp > 0) {
					numBest = numTest;
					demBest = demTest;
					difference = tmp;
					continue;
				}
			
				}
			}

		return((int) numBest + "/"  + (int) demBest);

	}
}
