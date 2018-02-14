package sortingStuff;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting<Integer> sort = new Sorting<Integer>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		tmp.add(1);
		tmp.add(3);
		tmp.add(2);
		tmp.add(6);
		Integer[] test = {1, 3, 2, 5};
		System.out.println(Arrays.toString(tmp.toArray(test)));
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(sort.quicksort(test)));
	}
}
