package aufgabenblaetter.blatt1;

/*
 * tt, 14.11.: Eine separate Klasse für das Ausschreiben auf die Kommandozeile ist prinzipiell eine gute Idee. 
 * Java bietet da auch schon einige verschiedene Varianten (sogenannte Logger), kannst du ja mal googlen. 
 * Z.B. gibt es welche, die dir vor jedem Kommentar anzeigen, aus welcher Klasse und welcher Zeile es stammt (hilfreich für komplexe Programme). 
 * In deinem Fall, wäre es einfacher gewesen, alle Console-Aufrufe durch System.out.println(…) zu ersetzen.
 * Falls du nur keine Lust auf das Getippe hattest: Das geht auch gut per Autovervollständigung mit syso. ;)
 */
public class Console {
	public static void log(float value) {
		String output;
		output = String.valueOf(value);
		System.out.println(output);
	}

	public static void log(int value) {
		String output;
		output = String.valueOf(value);
		System.out.println(output);
	}

	public static void log(char value) {
		String output;
		output = String.valueOf(value);
		System.out.println(output);
	}

	public static void log(String value) {
		String output;
		output = String.valueOf(value);
		System.out.println(output);
	}

	public static void log(Integer value) {
		String output;
		output = String.valueOf(value);
		System.out.println(output);

	}
}
