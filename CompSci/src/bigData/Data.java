package bigData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {

	private static final int ITERATOR = 42;
	private static final int BODYTYPE = 7 - 1;
	private static final int MAKE = 8 - 1;
	private static final int TIME = 20 - 1;
	private static final int STREETNAME = 25 - 1;
	private static final int COLOR = 34 - 1;
	
	File csv;
	ArrayList<String> data;
	String[] titles = {"BodyType", "Make", "Time", "StreetName", "Color"};
	int size;
	
	
	public Data() throws FileNotFoundException {
		
		csv = new File("/home/waford/Downloads/Speed_Camera_Tickets.csv");
		Scanner input = new Scanner(csv);
		input.useDelimiter(",");
		data = new ArrayList<String>();
		while(input.hasNext()) {
			data.add(input.next());
		}
		size = data.size();
		input.close();
	}
	
	public String[] getBodyType() {
		ArrayList<String> tmp = new ArrayList<String>();
		for(int i = BODYTYPE; i< data.size(); i+=ITERATOR) { //sets index to first iteration of of data point, increments by interator
			try {
				tmp.add(data.get(i));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		String[] tmp2 = new String[tmp.size()];
		for(int i = 0; i < tmp.size(); i++) {
			tmp2[i] = tmp.get(i);
		}
		return tmp2;
	}
	
	public String[] getMake() { //works the same way.
		ArrayList<String> tmp = new ArrayList<String>();
		for(int i = MAKE; i< data.size(); i+=ITERATOR) {
			try {
				tmp.add(data.get(i));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		String[] tmp2 = new String[tmp.size()];
		for(int i = 0; i < tmp.size(); i++) {
			tmp2[i] = tmp.get(i);
		}
		return tmp2;
	}
		
	public String[] getTime() {
		ArrayList<String> tmp = new ArrayList<String>();
		for(int i = TIME; i< data.size(); i+=ITERATOR) {
			try {
				tmp.add(data.get(i));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		String[] tmp2 = new String[tmp.size()];
		for(int i = 0; i < tmp.size(); i++) {
			tmp2[i] = tmp.get(i);
		}
		return tmp2;
	}
		
	public String[] getStreetName() {
		ArrayList<String> tmp = new ArrayList<String>();
		for(int i = STREETNAME; i< data.size(); i+=ITERATOR) {
			try {
				tmp.add(data.get(i));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		String[] tmp2 = new String[tmp.size()];
		for(int i = 0; i < tmp.size(); i++) {
			tmp2[i] = tmp.get(i);
		}
		return tmp2;
	}
	
	public String[] getColor() {
		ArrayList<String> tmp = new ArrayList<String>();
		for(int i = COLOR; i< data.size(); i+=ITERATOR) {
			try {
				tmp.add(data.get(i));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		String[] tmp2 = new String[tmp.size()];
		for(int i = 0; i < tmp.size(); i++) {
			tmp2[i] = tmp.get(i);
		}
		return tmp2;
	}
		
	

}


