package coinLab;

//this is a comment at the top of the lab to get credit for commenting. This is the coin lab. 
//returns the number of corresponding coins that add up to the amount (in the optimal representation with the smallest possible number of coins).  Coins objects are immutable (that is, none of the class’s methods changes any fields).  
public class Coins {
	int cents;
	int quarters;
	int dimes;
	int nickels;
	int pennies;
	
	public Coins(int cents) {
		this.cents = cents;
	
		if(cents / 25 >= 1) {
		quarters = (cents / 25);
		} if(cents / 10 >= 1) { 
		dimes = ((cents - 25*quarters) / 10);
		} if(cents / 5 >= 1) {
		nickels = ((cents - 25*quarters - 10*dimes) / 5);
		}
		pennies = ((cents - 25*quarters - 10*dimes - 5*nickels));
		
	}

	public int getQuarters() {
		return quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public int getPennies() {
		return pennies;
	}
	public boolean equals(Coins other) {
		if(this.cents == other.cents) {
			return true;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Coins [cents=" + cents + ", quarters=" + quarters + ", dimes=" + dimes + ", nickels=" + nickels
				+ ", pennies=" + pennies + "]";
	}
	
	public int compareTo(Coins other) {
		return(this.toString().compareTo(other.toString()));
	}
	
	
	
	

}
