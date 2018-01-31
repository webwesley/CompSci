package sortingStuff;

public class BinarySearch<E> {

	public BinarySearch() {
	}

	@SuppressWarnings("unchecked")
	public Comparable<E> search(Comparable<E>[] searchArray, Comparable<E> find) {
		int w = searchArray.length / 2;
		while(searchArray[w] != find) {
			Comparable<E> tmp = searchArray[w];
			if (tmp.compareTo((E) find) > 0) {
				w = w / 2;
				continue;
			} else if (tmp.compareTo((E) find) < 0){
				w += w / 2;
				continue;
			} else {
				return searchArray[w];
			}
		}
		return searchArray[w];
	}
}
