package sortingStuff;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting<Integer> sort = new Sorting<Integer>();
		Integer[] test = {1, 5, 2};
		System.out.println(Arrays.toString(sort.quickSortWithPointers(test)));
	}
}
