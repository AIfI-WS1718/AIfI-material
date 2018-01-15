package vorlesung.exceptions;

import java.io.IOException;

public class ThrowsStatement {

	public static void main(String[] args) throws IOException {
		testSomething();
	}
	
	static void testSomething() throws IOException {
		throw new IOException("Hallo");
	}

}
