
public class Calf extends Cow {

	private Cow mother; 

	Calf (String name, Cow mother){
		super(name);
		this.mother = mother;
	}
	
	@Override
	public String getName() {
		return super.getName() + "Mutter: " + mother.getName();
	}
	
	
}
