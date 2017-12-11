package uebung.ue8;

public class Person {
	String name="";
	int alter=0;
	
	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public void incrementAge() {
		alter++;
	}
	public String toString(){
		return("Dies ist die Person "+ name +", ihr Alter ist " + alter + ".");
	}
	
}
