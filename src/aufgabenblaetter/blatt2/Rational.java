package aufgabenblaetter.blatt2;

class Rational {
	private double zaehler;
	private double nenner;

	public Rational(){
		zaehler = 0;
		nenner = 1;
	}
	public Rational(double zaehler, double nenner) {
		this.setNenner(nenner);
		this.setZaehler(zaehler);
	}
	
	public void printRational() {
		System.out.println(zaehler + " / " + nenner);
	}
	
	public void setZaehler(double zaehler) {
		this.zaehler = zaehler;
	}
	public void setNenner(double nenner) {
		this.nenner = nenner;
	}
	
	public static void main(String[] args) {
		Rational foo = new Rational();
		foo.setZaehler(1);
		foo.setNenner(3);
		foo.printRational();
		foo.add(new Rational(1,2));
		foo.printRational();
	}
	public void invert() {
		double temp = this.zaehler;
		this.setZaehler(this.nenner);
		this.setNenner(temp);
	}
	public void negate() {
		this.setZaehler(-this.zaehler);
	}
	public double toDouble() {
		return(zaehler/nenner);
	}
	public Rational reduce() {
		Rational reducedRational = new Rational(0,1);
		//TODO
		return(reducedRational);
	}
		
	public void add(Rational bob) {
		Rational resultRational = new Rational();
		resultRational.zaehler = this.zaehler * bob.nenner;
		resultRational.nenner = this.nenner * bob.nenner;
		resultRational.zaehler += bob.zaehler * this.nenner;
		this.setNenner(resultRational.nenner);
		this.setZaehler(resultRational.zaehler);
	}
	
}
