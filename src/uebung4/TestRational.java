package uebung4;

public class TestRational {
	
public static void main(String[] args) {	
	Rational rational = new Rational ();
	rational.setZaehler(66);
	rational.setNenner(44);
	rational.printRational();
	rational.negate();
	rational.printRational();
	rational.invert();
	rational.printRational();
	double zahl = rational.toDouble();
	System.out.println(zahl);
	
	rational.reduce();
	rational.printRational();
	
	
	rational.add(45, 17);
	System.out.println("__________________________________________");
	ImmutableRational immR = new ImmutableRational (66,44);
	immR.printRational();
	ImmutableRational immR1 = immR.negate();
	immR1.printRational();
	
	ImmutableRational immR2 = immR1.invert();
	immR2.printRational();
	
	double zahl1 = immR2.toDouble();
	System.out.println(zahl1);
	
	ImmutableRational immR3 = immR2.reduce();
	immR3.printRational();
	
	ImmutableRational immR4 = immR3.add(45,17);
	immR4.printRational();
	
	
	
	
	
}
}
