package uebung.ue10;

import org.junit.Test;
import org.junit.Assert;



public class TestMyWurzel {

	public static void main(String args[]) {
		test();
	}
	
	@Test
	public static void test() {
		Assert.assertEquals("Die Wurzel aus 4 ist 2",MyWurzel.sqrt(4));
	}

}
