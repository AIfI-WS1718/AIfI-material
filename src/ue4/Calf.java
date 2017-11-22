package ue4;

class Calf extends Cow {
	Cow muttertier;
	Calf(String calfname, Cow mutter) {
		super(calfname);
		muttertier = mutter;
	}
	
	@Override
	public String getName() {
		return(super.getName() + muttertier.getName() );
	}
	
}
