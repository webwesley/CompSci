//calculates the total for an order of bp copies of "Be Prepared" and nb
//copies of "Next Best", taking the above specials into account.

package ATCS;

public class BePrepared {
	double BP;
	double NB;
	
	public BePrepared() {
		BP = 18.95;
		NB = 21.95;
	}
	
	public double calculateOrder(int numBP, int numNB) {
		if(numBP == 1 && numNB == 1) {
			return 37.95;
		} 
		if(numBP + numNB >= 3 && numBP + numNB < 12) {
			return (numBP + numNB) * 15.95;
		} if(numBP + numNB >= 12) {
			return (numBP + numNB) * 14;
		} else {
			return (numBP * BP + numNB * NB);
		}
		
		
	}

}
