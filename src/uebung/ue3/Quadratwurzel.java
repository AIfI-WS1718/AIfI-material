package uebung.ue3;

import java.util.Scanner;

public class Quadratwurzel {
	public static void main(String[] args) {

		calculate();
	}

	private static void calculate() {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			int exitCode = 0;
			System.out.println("Please give a positive number (or 0 for exit):");
			int inputNumber = scanner.nextInt();
			if (inputNumber < 0) {
				System.out.println("Error.");
				continue;
			} else if (inputNumber == exitCode) {
				break;
			}

			double value = Double.valueOf(inputNumber);
			double startX = value / 2;
			double buffer;

			do {

				buffer = startX;
				startX = nextX(value, startX);

			} while ((buffer - startX) > 0.0001);

			System.out.println("The squeare root of " + value + " is " + startX);
		}
		scanner.close();
	}

	private static double nextX(double a, double x0) {
		return (x0 + a / x0) / 2;
	}

}
