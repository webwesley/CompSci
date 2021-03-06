package lipogramAnalyzer;

//has methods to replace a specified letter in text with a #
// also has method to return a String with all "offending" words 

public class LipogramAnalyzer {
	String text;
	
	public LipogramAnalyzer(String text) {
		this.text =  " " + text.toLowerCase() + " ";
	}

	public String mark(char letter) {
		return(text.replace(letter, '#'));
	}
	
	public String allWordsWith(char letter) {
		String offended = "";
		
		int startIndex = 1;
		while(startIndex > 0) {
			String tmp = findWord(letter, startIndex);
			if(!offended.contains(tmp) && tmp .trim() != "") {
			offended = offended.concat(tmp);
			offended = offended.concat("\n");
			
			}
			
			startIndex = text.indexOf(letter, startIndex) + 1;
		
		}
		return offended;
		
	}

	
	private String findWord(char letter, int startIndex) {
		int index = text.indexOf(letter, startIndex);
		if(index <= 0) {
			return "";
		}
		int start = index;
		int end = index;
		
		while(text.charAt(start) != ' ') {
			start--;
		}
		while(text.charAt(end) != ' ') {
			end++;
		}
		
		return text.substring(start + 1, end);
	}
}
