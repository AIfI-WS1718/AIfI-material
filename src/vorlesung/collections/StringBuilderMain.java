package vorlesung.collections;

public class StringBuilderMain {

	public static void main(String[] args) {
		final int len = 30000;
		
		// StringBuilder funktioniert wie eine ArrayList und hängt weitere Elemente einfach an -> schnell
		StringBuilder strb = new StringBuilder();
		for (int ii = 1; ii < len; ii++) {
			strb.append("ab");
		}
		System.out.println(" strb: " + strb);

		// String ist unveränderbar (immutable) und muss deshalb bei jeder Veränderung ein neues Objekt erstellen -> langsam
		String str = "";
		for (int ii = 1; ii < len; ii++) {
			str += "ab";
		}
		System.out.println(" str: " + str);
	}

}
