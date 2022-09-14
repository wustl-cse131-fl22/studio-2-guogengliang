package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your starting amount?");
		double startAmount = scan.nextDouble();

		System.out.println("What is your win chance?");
		double winChance = scan.nextDouble();

		System.out.println("What is your win limit?");
		double winLimit = scan.nextDouble();

		int totalSimulations = 5;

		for (int i = 0; i <= totalSimulations; i++) {
			int j = 0;
			int k = 0;
			while (startAmount > 0 && startAmount < winLimit || startAmount <= 0) {
				double rnd = Math.random();

				totalSimulations = totalSimulations + 1;

				if (rnd < winChance) {
					startAmount = startAmount + 1;
					System.out.println("You have won! Your balance is: " + startAmount);
				} else {
					startAmount = startAmount - 1;
					System.out.println("You have lost! Your balance is: " + startAmount);
				}

				j=j+1;
				k=k+1;
				System.out.println(k);
			}

			System.out.println("Simulation " + i + ":" + j);

		}

	}

}
