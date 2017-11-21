package stringBuffer;

import java.text.DecimalFormat;

public class Formating {
	
	public static void minutes() {
		DecimalFormat money1 = new DecimalFormat("0.00");
		int num = 1134;
		double num1 = 123.546789;
		System.out.println(money1.format(num));
		System.out.println(money1.format(num1));
	}

}
