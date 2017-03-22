// Andrew Bub CSE 20312 Lab6 - Practice with Java class
// Menu.java

import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args)	{
		// setup
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		double subTotal = 0;
		double total = 0;
		int Selection = 0;
		
		int chickenCount = 0;
		int fishCount = 0;
		int steakCount = 0;
		int beerCount = 0;
		int wineCount = 0;
		
		double chicken = 12.95;
		double fish = 15.95;
		double steak = 22.95;
		double beer = 4.25;
		double wine = 4.25;

		int itemsNumber = 0;

		double tax = 0;
		double taxes = 0.10;
		double totalFinal = 0;

	do {
		// input
		System.out.println("Welcome to my restaurant");
		System.out.println(" 1) Chicken $" + chicken);
		System.out.println(" 2) Fish $" + fish);
		System.out.println(" 3) Steak $" + steak);
		System.out.println(" 4) Beer $" + beer);
		System.out.println(" 5) Wine $" + wine);
		
		if (Selection !=0) {
			System.out.println(" 0) Finish Order");
		}

		System.out.println("Current Subtotal $" + (df.format(total)));
		System.out.println("Please make your selection: ");
		Selection = input.nextInt();

		// computation
		if (Selection > 5 || Selection < 0) {
			System.out.println("No such item. Please enter a different choice");
		}else if (Selection == 1) {
			subTotal = chicken;
			++chickenCount;
			++itemsNumber;
			total = total + subTotal;
		}
		if (Selection == 2) {
			subTotal = fish;
			++fishCount;
			++itemsNumber;
			total = total + subTotal;
		}
		if (Selection == 3) {
			subTotal = steak;
			++steakCount;
			++itemsNumber;
			total = total + subTotal;
		}
		if (Selection == 4) {
			subTotal = beer;
			++beerCount;
			++itemsNumber;
			total = total + subTotal;
		}
		if (Selection == 5) {
			subTotal = wine;
			++wineCount;
			++itemsNumber;
			total = total + subTotal;
		}
		}while (Selection !=0);

		// final output
		tax = (total*taxes);
		totalFinal = total + tax;

		if(chickenCount !=0) {
			System.out.println(chickenCount+" Chickens");
		}if(fishCount !=0) {
			System.out.println(fishCount+" Fish");
		}if(steakCount !=0) {
			System.out.println(steakCount+" Steaks");
		}if(beerCount !=0) {
			System.out.println(beerCount+" Beers");
		}if(wineCount !=0) {
			System.out.println(wineCount+" Glasses of Wine");
		}

		System.out.println("Order: " + itemsNumber +" Items");
		System.out.println("Subtotal: $" + (df.format(total)));
		System.out.println("Tax (10%): $" + (df.format(tax)));
		System.out.println("Total: $" + (df.format(totalFinal)));
		System.out.println("Thank you, please come again!");
	}
}
