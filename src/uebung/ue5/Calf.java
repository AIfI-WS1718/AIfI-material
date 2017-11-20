package uebung.ue5;

public class Calf extends Cow {
	String namemother;
	Calf(String name, String namemother) {
		super(name,0);
		this.namemother = namemother;
	}
	
	@Override
	public String getName() {
		return super.getName() + ". Name meiner Mutter: " +  this.namemother + ".";
	}
}
