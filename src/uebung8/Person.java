package uebung8;

public class Person {
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
