package vorlesung.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	// rufe diese Klasse mit Argumenten, z.B. "i walk the line" auf (s. 'Run > Run Configuration... > Arguments')
	public static void main(String[] args) {
		List<String> l = Arrays.asList(args); // macht aus dem Array eine List
		Collections.sort(l); // sortiert lexikographisch
		System.out.println(l);
	}

}
