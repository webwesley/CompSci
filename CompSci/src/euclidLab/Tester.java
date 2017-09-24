package euclidLab;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primes prime = new Primes();
		System.out.println(prime.prime(5));
		System.out.println(prime.prime(-1));
		System.out.println(prime.primoral(5));
		System.out.println(prime.primoral(0));
		System.out.println(prime.euclidNunber(5));
		System.out.println(prime.euclidNunber(0));
		prime.euclidNumberList(5);
		Loops test = new Loops();
		test.loops(10, 10);
	} 

}
