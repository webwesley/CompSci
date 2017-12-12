package fortuneCookies;

import java.util.Scanner;

public class Fortune {

	public static void main(String[] args) {
		FCArrayList test = new FCArrayList();
		Scanner input = new Scanner(System.in);
		System.out.print("What do you want to do? ");
		String command = input.next().toLowerCase();
		input.nextLine();
		while (!command.equals("quit")) { //a large switch case that allows for user interaction
			input.reset();
			switch (command) {
			case "add":
				System.out.print("What fortune do you want to add: ");
				String fortune = input.nextLine();
				System.out.print("Where do you want to add it: ");
				int index = input.nextInt();
				try {
					test.add(fortune, index);
					System.out.println("Done");
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Sorry, looks like that index does not exists right now.");
				}
				break;
			case "peek":
				System.out.println(test.peek());
				break;
			case "get":
				System.out.print("Where do you want to get the fortune: ");
				input.nextLine();
				int index1 = input.nextInt();
				try {
					System.out.println(test.getFortune(index1));
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Sorry, looks like that index does not exists right now.");
				}
				break;
			case "poll":
				System.out.println(test.poll());
				break;
			case "remove":
				System.out.print("Where do you want to remove the fortune: ");
				input.nextLine(); //fires to remove newline char from stream, prevents errors
				int index2 = input.nextInt();
				try {
					System.out.println("Removed:" + test.remove(index2));
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Sorry, looks like that index does not exists right now.");
				}
				break;
			case "list":
				System.out.println(test.toString());
				break;
			case "size":
				System.out.println(test.size());
				break;
			default:
				System.out.println("Sorry, seems like that command doesn't exist. Please try again");
				break;
			}
							
			System.out.print("What do you want to do? ");
			command = input.next().toLowerCase();
		}
		input.close();
	}

}
