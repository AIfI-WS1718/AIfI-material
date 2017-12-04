package vorlesung.implementationInheritance;

public class Person /* extends Object */ {

	private int age = 3;
	
	Person(){
	}
	
	Person(int age){
		this.age = age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void walk() {
		System.out.println("walk walk...");
	}
	
	int getAge() {
		System.out.println("Calling Person getAge()...");
		return age;
	}
	
	@Override
	public String toString() {
		return "age " + age;
	}
	
}
