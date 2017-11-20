package vorlesung.simpleObjects;

public class MainClass {

	public static void main(String[] args) {
		Person schmitz = new Person();
//		schmitz.age = 20; // geht nicht, da age private
		schmitz.setAge(20);
//		schmitz.setName("schmitz"); // geht nicht, da setName private
		System.out.println("schmitz age: " + schmitz.getAge());
	}

}
