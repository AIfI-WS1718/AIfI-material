package uebung.ue10;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TestMyWurzel {

	@Test
	void testMyWurzel() {
		Assert.assertEquals("Die Wurzel aus 169 ist 13", MyWurzel.sqrt(169));
	}

}
