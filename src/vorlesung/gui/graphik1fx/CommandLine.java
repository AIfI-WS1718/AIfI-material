package vorlesung.gui.graphik1fx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLine {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Gib den Namen Deiner Katze ein.");
		final String correctAnswer = "Telefonmann";
		String input = in.readLine();
		while (!correctAnswer.equals(input)) {
			System.out.println("Das ist doch kein Name für eine Katze.");
			input = in.readLine();
		}
		System.out.println("Ist besser.");
	}

}
