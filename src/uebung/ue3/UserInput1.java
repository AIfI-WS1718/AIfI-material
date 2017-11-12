package uebung.ue3;

import java.util.Scanner;

public class UserInput1 {
	public static void main(String[] args) {
		scan();
	}

	public static void scan() {
		Taschenrechner2 t = new Taschenrechner2();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String exit = "Exit";
			System.out.println("Which calculation would you like to do?");
			String inputString = scanner.next();
			if (inputString.equals(exit)) {
				break;
			}
			System.out.println(" User would like: " + inputString);
			switch (inputString) {
			case "+":
				System.out.println("Please input the number");
				int inputIntAdd = scanner.nextInt();
				System.out.println("User gave: " + inputIntAdd);
				t.add(inputIntAdd);
				System.out.println("Ergebnis: " + t.getResult());
				break;
			case "-":
				System.out.println("Please input the number");
				int inputIntSub = scanner.nextInt();
				System.out.println("User gave: " + inputIntSub);
				t.substract(inputIntSub);
				System.out.println("Ergebnis: " + t.getResult());
				break;
			case "!":
			case "fac":
			case "Fakultaet":
				double vv = t.getResult();
				t.fakultaet();
				System.out.println("The factorial of : " + vv + " is " + t.getResult());
				break;
			case "sqrt":
			case "root":
				double ww = t.getResult();
				t.sqrt();
				System.out.println(" The root of : " + ww + " is " + t.getResult());
				break;
			case "reset":
				double xx = t.getResult();
				t.reset();
				System.out.println("The number was reseted from " + xx + " to " + t.getResult());
				break;
			default:
				System.out.println("Not valid user input! Please use the +, -, !, fac, Fakultaet, sqrt or root.");
				break;

			}
			
		}
		scanner.close();

	}
}
