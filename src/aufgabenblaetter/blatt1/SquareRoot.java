package aufgabenblaetter.blatt1;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		System.out.print("Zahl angeben: ");
		double a = scanner.nextInt();
		scanner.close();
		
		double xold = a/2;
		double xnew = 0;
		double difference = a;
		
		while (difference > 0.0001) {
			xnew = (xold+(a/xold))/2;
			difference = Math.abs(xnew - xold);
			xold = xnew;
		}
		
		
		System.out.print("Ergebnis: ");
		System.out.print(xnew);
		System.out.print(", Kontrollergebnis: ");
		double kontrolle = Math.sqrt(a);
		System.out.print(kontrolle);		
	}

}
