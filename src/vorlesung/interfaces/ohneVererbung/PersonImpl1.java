package vorlesung.interfaces.ohneVererbung;

public class PersonImpl1 implements PersonI {

	private int age;
	
	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
