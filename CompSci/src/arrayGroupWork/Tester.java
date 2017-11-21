package arrayGroupWork;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		int[] b = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		Seven tmp = new Seven();
		System.out.println("The sum of " + Arrays.toString(a) + " and " + Arrays.toString(b) + " is:\n " + Arrays.toString(tmp.add(a, b)));
//		double[] aa = {1, 2, 3};
//		double[] bb = {3, 2, 1};
//		Polynomial first = new Polynomial(aa);
//		Polynomial second = new Polynomial(bb);
//		System.out.println("The degree of this polynomail is: " + first.degree());
//		System.out.println("Using an inefficent method, the value of first at two is: " + first.getValue(2));
//		System.out.println("Using an efficent method, the value of first at two is: " + first.getBetterValue(2));
//		System.out.println("The first function times the second function is this: " + first.multiply(second).toString());
	}

}
