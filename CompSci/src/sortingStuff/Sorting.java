package sortingStuff;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting<E extends Comparable<E>> {
	
	public Sorting() {}
	
	
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
	
	public E[] quicksort(E[] unsorted) {
		if(unsorted.length <= 1) {
			return unsorted;
		}
		E pivot = (E) unsorted[unsorted.length - 1];
		ArrayList<E> larger =  new ArrayList<E>();
		ArrayList<E> smaller = new ArrayList<E>();
		for(int i = 0; i < unsorted.length - 1; i++) {
			if(unsorted[i].compareTo(pivot) < 0) {
				smaller.add(unsorted[i]);
			}
			if(unsorted[i].compareTo(pivot) >= 0) {
				larger.add(unsorted[i]);
			}
		}
		ArrayList<E> sorted = new ArrayList<E>();
		E[] smallerArr = (E[]) new Object[smaller.size()];
		smaller.toArray(smallerArr);
		E[] largerArr = (E[]) new Object[smaller.size()];
		smaller.toArray(largerArr);
		
		sorted.addAll(quicksort(smallerArr));
		
	}
}
	


	
	
	
	
	