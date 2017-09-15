package euclidLab;

/**
 * This code implements a ArrayList Cache. 
 */

import java.util.ArrayList;

public class Primes {
	ArrayList<Integer> primeCache;

	public Primes() {
		this.primeCache = new ArrayList<Integer>(); // sets up a cache for prime numbers
		primeCache.add(2);	//2 is already added to create the minimum number of iterations for larger primes
	}

	public int prime(int num) {
		try {
			return(primeCache.get(num - 1));
		} catch (IndexOutOfBoundsException e) {
			for (int i = primeCache.get(primeCache.size() - 1) + 1; primeCache.size() < num; i++) {
				if(isPrime(i)) {
					primeCache.add(i);
				}

			}
			try {
			return(primeCache.get(num - 1));
			} catch(IndexOutOfBoundsException e1) {
				System.out.println("Dude you need to have a real integer");
				System.out.println(e1);
				return(-1);
			}
		}

	}
	// checks if int n is a prime number, returns true or false
	private boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if((n % i) == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	// returns the multiplication of all of the first nth prime numbers
	public int primoral(int n) {
		if(n < 1 || n > 11) {
			return -1;
		} 
		prime(n);
		int tmp = 1;
		for(int i = 0; i< n ; i++) {
			tmp *= primeCache.get(i);
		}
		return tmp;
	}
	//returns a euclidNumber, primoral + 1
	public int euclidNunber(int n) {
		if(primoral(n) + 1 == 0) {
			return -1;
		} else {
		return primoral(n) + 1;
		}
	}
	
	//prints out the first n number of Euclid numbers
	public void euclidNumberList(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(euclidNunber(i));
		}
	}
	
}
