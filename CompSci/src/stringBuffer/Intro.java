package stringBuffer;

public class Intro {

	public static void main(String[] args) {
		StringBuffer one = new StringBuffer(); //has an initial capacity of 16
		StringBuffer two = new StringBuffer(26); //has an initial capacity of 26
		StringBuffer three = new StringBuffer("Communism"); //has an initial capacity of string length + 16. In this case 25
		
		System.out.println(three.substring(0,3));
		System.out.println(three.length());
		System.out.println(three.capacity());
		System.out.println(three.append(" is the best"));
		System.out.println(three.insert(13, "really "));
		System.out.println(three.delete(12, 19));
		System.out.println(three.replace(0, 9, "Prolitariates"));
		System.out.println(three.deleteCharAt(12));
		

	}

}
