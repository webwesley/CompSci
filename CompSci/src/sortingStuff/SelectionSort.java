package sortingStuff;

public class SelectionSort<E extends Comparable<E>> {
	
	public SelectionSort() {}
	
	
	public E[] sort(E[] array) {
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

}
