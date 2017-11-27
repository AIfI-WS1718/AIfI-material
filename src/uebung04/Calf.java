package uebung04;

public class Calf extends Cow {

	Cow mom;
	
	Calf(String name, Cow mom){
		super(name);
		this.mom = mom;
		
		
	}
	@Override
	public String getName() {
		return super.getName() + " Mutter: "+ mom.getName();
	}
}
