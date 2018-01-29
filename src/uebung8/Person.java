package uebung8;

public class Person {
	boolean hungry;
	
	void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	String name;
	int age;
Person (String name, int age){
	this.name = name;
	this.age = age;
}
public String toString() {
	return name +" "+ age;
}
public void ageIncrease() {
	age =  age+1;
	
}

}
