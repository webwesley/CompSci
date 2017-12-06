package anagramLab;

public class Words {

	String initial;
	String sorted;

	public Words(String word) {
		this.initial = word.toLowerCase();
		sorted = sort(initial);
	}

	private String sort(String word) {
 		String a = "";
		String b = "";
		if (word.length() > 1) {
			int partition = word.length() - 1;
			b += word.charAt(partition);
			for (int i = 0; i < word.length() - 1; i++) {
				if (word.charAt(i) < word.charAt(partition)) {
					a += word.substring(i, i + 1);
				} else {
					b += word.substring(i, i + 1);
				}
			}

			sort(a);
			sort(b);
		}
		return a + b;
	}
}
