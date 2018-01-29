package vorlesung.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyFirstTest {

	private static final String hello = "and I say hello...";
	private static final String goodbye = "You say goodbye...";

	@Before
	public void setUp() {
		// Diese Methode wird vor jeder Testmethode aufgerufen.
		// Ohne diese Initialisierung wären die Testmethoden testGoodbye() und testHelloGoodbye() voneinander abhängig.
		HelloWorld.sayHello = false;
	}

	@Test
	public void testHelloWorld() {
		Assert.assertEquals("Hello World", HelloWorld.getHello());
	}
	
	@Test
	public void testGoodbye() {
		// testet den ersten Aufruf der Methode
		Assert.assertEquals("did not work", goodbye, HelloWorld.sayHelloGoodbye());
	}

	@Test
	public void testHelloGoodbye() {
		// testet den ersten Aufruf der Methode
		Assert.assertEquals("did not work", goodbye, HelloWorld.sayHelloGoodbye());

		// testet weitere 10 Aufrufe der Methode
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				Assert.assertEquals(hello, HelloWorld.sayHelloGoodbye());
			} else {
				Assert.assertEquals(goodbye, HelloWorld.sayHelloGoodbye());
			}
		}
	}

}
