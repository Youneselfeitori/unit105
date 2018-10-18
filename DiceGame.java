/****************************************************************************
 * Created by:Younes Elfeitori
 * Created on: Sep 2018
 * This program calculate how many logs can carry on the truck
 ****************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		int tries = 1;
		
		System.out.println("This is a game about guessing numbers.");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		int random = new Random().nextInt(6) + 1;
		System.out.println("Enter a random number between 1 and 6.");
		
		do{
			int user = scanner.nextInt();
			if(random == user) {
				System.out.println("You got it !");
				System.out.println("You took " + tries + " tries. ");
				break;
			}
			else if(user > 6) {
				System.out.println("Invalid input ! You can only input numbers between 1-6 !");
			}
			else{
				System.out.println("Keep Trying !");
				tries++;
			}
			
		}while(true);
		
		scanner.close();

	}

}
