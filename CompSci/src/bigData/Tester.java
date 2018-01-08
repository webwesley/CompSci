package bigData;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Tester {
	public static void main(String[] args) throws FileNotFoundException {
		Data data = new Data();
		InterdependentMethods tmp = new InterdependentMethods(data);
		System.out.println(tmp.percent("1200A", "1200P"));
//		System.out.println(tmp.findAfromB("Streetname", "make", "ford"));
//		System.out.println(tmp.findSecondAfromB("bodytype", "make", "Nissa"));
	}
}
