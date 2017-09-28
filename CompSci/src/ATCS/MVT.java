package ATCS;

public class MVT {

	public int function(int a, int b, int c, int x) {
		return (a * x * x) + (b * x) + c;
	}

	public int fPrime(int A, int B, int C, int a, int b) {
		return (function(A, B, C, a) - function(A, B, C, b)) / (b - a);
	}

}
