package arrayGroupWork;


public class Seven {
	private final int N = 30;

	protected int[] add(int[] a, int[] b) {
		int size = 0;
	
		if(a.length > b.length) {
			size = a.length;
			int[] tmp = new int[size + 1];
			int j = 0;
			for(int i = (size - b.length); i < size; i++) {
				tmp[i] = b[j];
				j++;
			}
			b = tmp;
		} else {
			size = b.length;
			int[] tmp = new int[size];
			int j = 0;
			for(int i = (size - a.length); i < size; i++) {
				tmp[i] = a[j];
				j++;
			}
			a = tmp;
		}
		int[] sum = new int[size];
		for(int i = size - 1 ; i >= 0; i--) {
			if(a[i] + b[i] > 9) {
				sum[i] = ((a[i] + b[i]) - 10);
				sum[i - 1] ++;
			}
			sum[i] = a[i] + b[i];
			
		}
		return sum;
	}

}
