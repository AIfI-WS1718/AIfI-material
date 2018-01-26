package vorlesung.exceptions;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class TryCatchFinally {

	public static void main(String[] args) {
		simpleTryCatch();
		System.out.println("\n");
		moreComplexTryCatchCatchFinally();
	}

	private static void simpleTryCatch() {
		try {
			throw new Exception("Das ist wohl schiefgelaufen...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void moreComplexTryCatchCatchFinally() {
		try {
			doSomething();
			System.out.println("Wenn eine Exception im try-Block auftritt, wird der try-Block an der Stelle sofort abgebrochen.");
		} catch (IOException e) {
			// TODO do something... (hier sieht man, dass ein catch-Block auch leer sein darf)
		} catch (Exception e) {
			System.out.println(e.toString());
//			e.printStackTrace();
//			throw new RuntimeException(e.getMessage()); // werfe eine RuntimeException, wenn das Programm abbrechen soll
		} finally {
			// ...
			System.out.println("Egal ob Exception oder nicht -- das hier wird nach try-catch ausgeführt");
		}

		// ...
		System.out.println("Hier geht es nach dem try-catch-finally-Block normal weiter");
	}

	private static void doSomething() throws Exception {
		throw new Exception("Hier ist ein Fehler");
	}

}
