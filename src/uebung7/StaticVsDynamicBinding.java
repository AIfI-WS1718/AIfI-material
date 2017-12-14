package uebung7;

public class StaticVsDynamicBinding {
	
	public static void callEat(Animal animal) {
		System.out.println("Animal is eating.");
	}
	public static void callEat(Dog dog) {
		System.out.println("Dog is eating.");
	}
	public static void main(String[] args) {
		Animal jhora = new Dog();
		callEat(jhora); // Static binding am Kompilierzeittyp
		jhora.eat();  // Dynamik Binding am Laufzeittyp
	}

}
