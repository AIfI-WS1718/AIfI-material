package uebung4;

public class Calf extends Cow {
    Cow Muttertier;
	Calf(String calfName, Cow Mutter){
		super(calfName);
		Muttertier = Mutter;
			
}
    public String getName() {
	return super.getName() + " " + Muttertier.getName();
	}
}