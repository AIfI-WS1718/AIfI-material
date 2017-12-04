package vorlesung.interfaces.mehrereInterfacesImplementieren;

import vorlesung.interfaces.mitMehrfachvererbung.EmployableI;
import vorlesung.interfaces.ohneVererbung.PersonI;

public class AdultImpl3 implements PersonI, EmployableI{

	private String employer;
	private int age;
	
	@Override
	public String getEmployer() {
		return employer;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

}
