package lipogramAnalyzer;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LipogramAnalyzer lip = new LipogramAnalyzer("According to " + 
				"Wikipedia " + 				
				"a " + 
				"lipogram " + 
				" from Greek lipagrammatos missing " + 
				"letter is a kind of writing with \n" +
				"constraints or word game consisting of writing paragraphs or longer works in which \n" + 
				"a particular letter or group of letters is missing usually a common vowel the most \n" + 
				"common in English being e");
		
		System.out.println("This is the method marking all the i with #: \n\n" + lip.mark('i') + "\n");
		System.out.println("This is a string with all offending words that contain the letter o: \n\n" + lip.allWordsWith('o'));
	}
	

}
