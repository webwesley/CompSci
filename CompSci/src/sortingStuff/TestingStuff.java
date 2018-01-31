package sortingStuff;

import java.util.Arrays;

public class TestingStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort<Integer> sort = new SelectionSort<Integer>();
		Integer[] test = {2, 4, 1, 5};
		System.out.println(Arrays.toString(sort.sort(test)));
	}

}
