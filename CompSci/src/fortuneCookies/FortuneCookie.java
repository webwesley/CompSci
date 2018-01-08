package fortuneCookies;

import java.util.Arrays;
import java.util.Random;

public class FortuneCookie {
	private Integer[] luckyNum = new Integer[6];
	private String fortune;
	
	public FortuneCookie(String fortune) {
		this.fortune = fortune;
		makeNum();
	}

	private void makeNum() {
		Random num = new Random();
		for(int i = 0; i < 6; i++) {
			if()
			luckyNum[i] = num.nextInt(100); 
		}
	}
	
	public String getNum() {
		String tmp = "";
		for(int i = 0; i < 6; i++) {
			tmp += luckyNum[i].toString();
		}
		return tmp;
	}
	
	public String getFortune() {
		return fortune;
	}
	
	public boolean equals(FortuneCookie cookie) { //this is redundant
		return this.equals(cookie);
	}
	
	public int compareTo(FortuneCookie cookie) { //so is this
		return this.compareTo(cookie);
	}

	public String toString() {
		return "Lucky Number: " + Arrays.toString(this.luckyNum) + ", Fortune: " + this.fortune;
	}
}
