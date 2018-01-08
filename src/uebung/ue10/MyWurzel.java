package uebung.ue10;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class MyWurzel {
	
	

	
	@Before
	public static String sqrt(int n) {
		int sqr = 0;
		int result = 0;
		for (; result < n; sqr++) {
			result = sqr * sqr;
		}
		if (result == n) {
			return "Die Wurzel aus " + n + " ist " + sqr;
		} else {
			return "Keine Wurzel für " + n + " gefunden. Die nächst größere Zahl mit einer "
					+ "Wurzel in den natürlichen Zahlen ist " + result + ". Die Wurzel ist " + sqr;
		}
	}
	
	
}
