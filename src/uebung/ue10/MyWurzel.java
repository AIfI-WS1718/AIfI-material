package uebung.ue10;

import org.junit.Test;

import org.junit.Assert;

public class MyWurzel {

	@Test
	public void main() {
		Assert.assertEquals("Die Wurzel aus 24 ist 5", sqrt(24));
	}

	public static String sqrt(int n) {
		int sqr = 0;
		int result = 0;
		for (; result < n; sqr++) {
			result = sqr * sqr;
		}
		sqr--;
		if (result == n) {
			return "Die Wurzel aus " + n + " ist " + sqr;
		} else {
			return "Keine Wurzel f�r " + n + " gefunden. Die n�chst gr��ere Zahl mit einer "
					+ "Wurzel in den nat�rlichen Zahlen ist " + result + ". Die Wurzel ist " + sqr;
		}
	}
}
