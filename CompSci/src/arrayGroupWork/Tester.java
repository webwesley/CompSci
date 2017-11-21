package arrayGroupWork;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//		int[] b = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//		Seven tmp = new Seven();
//		System.out.println(Arrays.toString(tmp.add(a, b)));
		double[] aa = {1, 2, 3};
		double[] bb = {3, 2, 1};
		Polynomial first = new Polynomial(aa);
		Polynomial second = new Polynomial(bb);
		System.out.println(first.getValue(2));
		System.out.println(first.getBetterValue(2));
		System.out.println(first.multiply(second).toString());
	}

}
