package anagramLab;

public class Word {

	String initial;
	String sorted;

	public Word(String word) {
		this.initial = word.toLowerCase();
		sorted = sort(initial);
	}

	private String sort(String word) { // implements a quicksort algorithm
		String a = "";
		String b = "";
		char pivotChar;
		if (word.length() > 1) {
			int pivot = word.length() - 1;
			pivotChar = word.charAt(pivot);
			for (int i = 0; i < word.length() - 1; i++) {
				if (word.charAt(i) < word.charAt(pivot)) {
					a += word.charAt(i);
				} else {
					b += word.charAt(i);
				}
			}
			return sort(a) + pivotChar + sort(b);
		}
		return word;

	}

	public boolean isAnagram(String word) {
		return(this.sorted.equals(sort(word)));
	}

	@Override
	public String toString() {
		return "Words [initial=" + initial + ", sorted=" + sorted + "]";
	}
	
	

}
