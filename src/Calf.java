
public class Calf extends Cow {

	private String mother; 

	Calf (String name, String mother){
		super(name);
		this.mother = super.getName();
	}

	public String getMother() {
		return mother; 
	}
	
	public void setMother(String mother) {
		this.mother = mother; 
	}
	
	
}
