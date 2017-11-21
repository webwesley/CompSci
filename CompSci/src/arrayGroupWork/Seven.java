package arrayGroupWork;

public class Seven {
	/*
	 * So this one's a dozzie. First we check which array is larger... we do this so
	 * that we know how large the sum will be (it can only be one degree larger than
	 * the largest value, so thats why. Then, we add each element of a to the
	 * corresponding elemnt of b, starting with the end of each array (with degree
	 * 0) if the sum of the elements is greater than 9, we make the value that sum -
	 * 10, and add one to the next element. If not, we just use the sum of the
	 * elementrs at the end, we return it
	 */
	protected int[] add(int[] a, int[] b) {
		int size = a.length;

		if (a.length > b.length) {
			size = a.length;
			int[] tmp = new int[size + 1];
			int j = 0;
			for (int i = (size - b.length); i < size; i++) {
				tmp[i] = b[j];
				j++;
			}
			b = tmp;
		} else if (a.length < b.length) {
			size = b.length;
			int[] tmp = new int[size + 1];
			int j = 0;
			for (int i = (tmp.length - a.length); i < tmp.length; i++) {
				tmp[i] = a[j];
				j++;
			}
			a = tmp;
		}
		int[] sum = new int[size + 1];
		for (int i = size ; i > 0; i--) {
			sum[i] += (a[i - 1] + b[i - 1]);
			if(sum[i] > 9) {
				sum[i] -= 10;
				sum[i - 1] += 1;
			}
		}
		return sum;
	}

}
