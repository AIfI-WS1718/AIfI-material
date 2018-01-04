package uebung.ue10;

import org.junit.Assert;
import org.junit.Test;

public class TestMyWurzel {
	
	@Test
	public void testMyWurzel4() {
		Assert.assertEquals("Die Wurzel aus 4 ist 2", MyWurzel.sqrt(4));
	}

}
