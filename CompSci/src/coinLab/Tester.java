package coinLab;



public class Tester {

	public static void main(String[] args) {
		Coins coins = new Coins(69);
		System.out.println("Quarters: " + coins.getQuarters());
		System.out.println("Dimes: "+ coins.getDimes());
		System.out.println("Nickels: "+ coins.getNickels());
		System.out.println("Pennies: " +coins.getPennies());
		Coins coins1 = new Coins(69);
		System.out.println("Are these two coin objects equal? " + coins.equals(coins1));
		System.out.println(coins.toString());
		System.out.println("We are comparing thes two methods: " + coins.compareTo(coins1));
		
	}
}
