package bigData;

import java.util.ArrayList;

public class InterdependentMethods {

	Data data;

	public InterdependentMethods(Data data) {
		this.data = data;
	}

	public String findAfromB(String a, String b, String detail) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		detail = detail.toUpperCase();
		String[] aString = { "" };
		String[] bString = { "" };
		switch (a) {
		case "bodytype":
			aString = data.getBodyType();
			break;
		case "color":
			aString = data.getColor();
			break;
		case "make":
			aString = data.getMake();
			break;
		case "streetname":
			aString = data.getStreetName();
			break;
		case "time":
			aString = data.getTime();
			break;
		default:
			System.out.println("Sorry, it seems like your a inputs was wrong");
		}
		switch (b) {
		case "bodytype":
			bString = data.getBodyType();
			break;
		case "color":
			bString = data.getColor();
			break;
		case "make":
			bString = data.getMake();
			break;
		case "streetname":
			bString = data.getStreetName();
			break;
		case "time":
			bString = data.getTime();
			break;
		default:
			System.out.println("Sorry, it seems like your b inputs was wrong");
		}
		ArrayList<String> aTmp = new ArrayList<String>();
		ArrayList<Integer> aCount = new ArrayList<Integer>();
		for (int i = 0; i < bString.length; i++) {
			try {
				if (bString[i].equals(detail)) {
					if (!aTmp.contains(aString[i])) {
						aTmp.add(aString[i]);
						aCount.add(1);
					} else {
						int j = aTmp.indexOf(aString[i]);
						aCount.set(j, aCount.get(j) + 1);
					}
				}

			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		int most = 0;
		int indexOne = 0;
		for (int i = 0; i < aCount.size(); i++) {
			int tmp = aCount.get(i);
			if (aCount.get(i) > most) {
				most = aCount.get(i);
				indexOne = i;
			}
		}
		return "Most ticketed " + a + " for " + detail + " is: " + aTmp.get(indexOne);
	}

	public String findSecondAfromB(String a, String b, String detail) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		detail = detail.toUpperCase();
		String[] aString = { "" };
		String[] bString = { "" };
		switch (a) {
		case "bodytype":
			aString = data.getBodyType();
			break;
		case "color":
			aString = data.getColor();
			break;
		case "make":
			aString = data.getMake();
			break;
		case "streetname":
			aString = data.getStreetName();
			break;
		case "time":
			aString = data.getTime();
			break;
		default:
			System.out.println("Sorry, it seems like your a inputs was wrong");
		}
		switch (b) {
		case "bodytype":
			bString = data.getBodyType();
			break;
		case "color":
			bString = data.getColor();
			break;
		case "make":
			bString = data.getMake();
			break;
		case "streetname":
			bString = data.getStreetName();
			break;
		case "time":
			bString = data.getTime();
			break;
		default:
			System.out.println("Sorry, it seems like your b inputs was wrong");
		}
		ArrayList<String> aTmp = new ArrayList<String>();
		ArrayList<Integer> aCount = new ArrayList<Integer>();
		for (int i = 0; i < bString.length; i++) {
			try {
				if (bString[i].equals(detail)) {
					if (!aTmp.contains(aString[i])) {
						aTmp.add(aString[i]);
						aCount.add(1);
					} else {
						int j = aTmp.indexOf(aString[i]);
						aCount.set(j, aCount.get(j) + 1);
					}
				}

			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		int most = 0;
		int indexOne = 0;
		int second = 0;
		int indexTwo = 0;
		for (int i = 0; i < aCount.size(); i++) {
			if (aCount.get(i) < most && aCount.get(i) > second) {
				second = aCount.get(i);
				indexTwo = i;
			}
			if (aCount.get(i) > most) {
				most = aCount.get(i);
				indexOne = i;
			}
		}
		return "Second most ticketed " + a + " for " + detail + " is: " + aTmp.get(indexTwo);
	}

	public long percent(String timeA, String timeB) {
		int timeANum = Integer.parseInt(timeA.substring(0, 4));
		int timeBNum = Integer.parseInt(timeB.substring(0, 4));
		if (timeA.toLowerCase().charAt(4) == 'p') {
			timeANum += 1200;
		}

		if (timeB.toLowerCase().charAt(4) == 'p') {
			timeBNum += 1200;
		}
		String[] tmp = data.getTime();
		long number = 0;
		long total = 0;
		for(int i = 1; i < tmp.length; i++) {
			int tmp2 = 0;
			if (tmp[i].toLowerCase().charAt(4) == 'p') {
				tmp2 += 1200;
			}
			tmp2 += Integer.parseInt(tmp[i].substring(0, 4));
			if( tmp2 >= timeANum && tmp2 <= timeBNum) {
				number++;
			}
			total = i;
		}
		return (number / total) * 100; 
		
	}
}
