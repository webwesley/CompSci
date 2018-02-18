package sortingStuff;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting<E extends Comparable<E>> {
	int iterations;
	
	public Sorting() {
		this.iterations = 0;
	}
	
	public void resetIterations() {
		this.iterations = 0;
	}
	
	
	public E[] selectionSort(E[] array) {
		int i = 0; //pointer 1
		int j = 0; //pointer 2
		while(i < array.length - 1) {
			for(int w = i; w < array.length; w++) {
				if((array[j]).compareTo(array[w]) > 0) {
					j = w;	
				}
			}
			E tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
			
			i++;
			j = i;
		}
		return array;		
	}
	
	public E[] bubbleSort(E[] array) {
		boolean sorted = true;
		for(int i = array.length - 2; i>1; i--) {
			sorted = true;
			for(int j = 0; j <i-1; j++) {
				if(array[i].compareTo(array[j+1]) > 0) {
					sorted = false;
					E tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
			if(sorted) {
				return array;
			}
		}
		return array;
	}
	
	@SuppressWarnings("unchecked")
	
	public Integer[] quickSort(Integer[] unsorted) {
		iterations++;
		if(unsorted.length <= 1) {
			return unsorted;
		}
		Integer pivot = unsorted[unsorted.length - 1];
		ArrayList<Integer> larger =  new ArrayList<Integer>();
		ArrayList<Integer> smaller = new ArrayList<Integer>();
		for(int i = 0; i < unsorted.length - 1; i++) {
			if(unsorted[i].compareTo(pivot) < 0) {
				smaller.add(unsorted[i]);
				continue;
			}
			if(unsorted[i].compareTo(pivot) >= 0) {
				larger.add(unsorted[i]);
			}
		}
		Integer[] smallerArr = new Integer[smaller.size()];
		smaller.toArray(smallerArr);
		Integer[] largerArr = new Integer[larger.size()];
		larger.toArray(largerArr);
		Integer[] tmp = {pivot};
		return concat(concat(quickSort(smallerArr), tmp),  quickSort(largerArr));
		
		
	}
	
	public E[] quickSortWithPointers(E[] array, int low, int high) {
		if(low < high) {
			int p = partition(array, low, high);
			
		}
		
		
		quickSortWithPointers(tmp1);
		
	}

	private int partition(E[] array, int low, int high) {
		E pivot = array[high];
		int j = low - 1;
		for(int i = low; i < high - 1; i++) {
			if(array[j].compareTo(pivot) < 0) {
				i += 1;
				E tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
			}
		}
		E tmp = array[j + 1];
		array[j + 1] = array[high];
		array[high] = tmp;
	}

	private Integer[] concat(Integer[] smallerArr, Integer[] largerArr) {
		Integer[] tmp = new Integer[smallerArr.length + largerArr.length];
		int index = smallerArr.length;
		for(int i = 0; i < smallerArr.length; i++) {
			tmp[i] = smallerArr[i];
		}
		for(int i = 0; i < largerArr.length; i++) {
			tmp[index + i] = largerArr[i];
		}
		return tmp;
	}
}
	


	
	
	
	
	