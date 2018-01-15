package vorlesung.junit;

class HelloWorld {

	static boolean sayHello = false;

	static String getHello() {
		return "Hello World";
	}

	public static String sayHelloGoodbye() {
		if (sayHello) {
			sayHello = false;
			return "and I say hello...";
		} else {
			sayHello = true;
			return "You say goodbye...";
		}
	}

}
