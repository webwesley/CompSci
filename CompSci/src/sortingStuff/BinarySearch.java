package sortingStuff;

public class BinarySearch <E> {
	
	

	public BinarySearch() {
	}
	
	@SuppressWarnings("unchecked")
	public E search(Comparable<E>[] searchArray, Comparable<E> find) {
		int w = searchArray.length / 2;
		int j = 0;
		for(int i = 0; i < Math.log(searchArray.length); i++) {
			Comparable<E> tmp = searchArray[w];
			if(tmp.compareTo((E) find) == 0) {
				return (E) searchArray[w];
			} else if(tmp.compareTo((E) find) > 0 ) {
				w = w/2;
				continue;
			} else {
				w += w/2;
				continue;
			}
		
	}
}
