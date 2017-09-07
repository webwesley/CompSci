package assignment1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args0){
		Scanner input = new Scanner(System.in);
		int num;
		do{
		System.out.print("Enter a number between 1 and 10: ");
		num = input.nextInt();
		
		} while (num > 10);
		input.close();
		int sum = 0;
		for(int i = 1; i < num; i++){
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(num + " = " + (sum + num));
	}
}
