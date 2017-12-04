package vorlesung.interfaces.mitVererbung;

public class AdultImpl1 implements AdultI {

	private int age;
	private String employer;
	
	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String getEmployer() {
		return employer;
	}

}
