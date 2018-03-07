package sortingStuff;

import java.util.ArrayList;

public class radixSort {

	ArrayList<ArrayList<Integer>> numbers;
	int[] array;

	public radixSort(int[] array) {
		numbers = new ArrayList<ArrayList<Integer>>(10);
		for(int i )
		this.array = array;
	}

	public int[] sort() {
		int iterations = getIterations();
		for (int i = 0; i < iterations; i++) {
			for (int j = 0; j < array.length; j++) {
				int tmp = (int) (array[j] % Math.pow(10, i));
				numbers.get(tmp).add(array[j]);
			}
			resetArray();
		}

		return array;
	}

	private void resetArray() {
		int index = 0;
		for(int i = 0; i < numbers.size(); i++) {
			for(int j = 0; j < numbers.get(i).size(); j++) {
				array[index] = numbers.get(i).get(j);
			}
		}
		
	}

	private int getIterations() {
		return (int) Math.log10(findMaximum()) + 1;
	}


	private int findMaximum() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max > array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] tmp = {21, 31, 105, 101};
		radixSort test = new radixSort(tmp);
		test.sort();
	}
}
