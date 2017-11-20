package aufgabenblaetter.blatt2;

class ImmutableRational {

	public static void main(String[] args) {
		ImmutableRational r = new ImmutableRational();
		r.printRational();
		r.toDouble();
		r.add(10, 20);
		ImmutableRational rl = new ImmutableRational(3,6);
		rl.printRational();
		r.reduce();
		r.invert();
		r.printRational();
		r.negate();
		r.printRational();
		
	}

	Integer zaehler;
	Integer nenner;
	

	public ImmutableRational () {
		this.zaehler=10;
		this.nenner=20;
	}
	public ImmutableRational (Integer z, Integer n) {
		this.zaehler=z;
		this.nenner=n;
	}
	public void printRational() {
	System.out.println(zaehler + "/" + nenner);
	}
	public void negate() {
		this.nenner = -this.nenner;
		this.zaehler = -this.zaehler;
	}
	public void invert() {
		Integer u;
		u = this.nenner;
		this.nenner = this.zaehler;
		this.zaehler = u;
	}
	public void toDouble() {
		double da;
		double db;
		double wert;
		da = this.zaehler;
		db = this.nenner;
		wert = da/db;
		System.out.println("Doublewert: " + wert);
	}
	public void reduce () {
		if (this.zaehler<this.nenner && this.nenner%this.zaehler == 0) {
			this.nenner=this.nenner/this.zaehler;
			this.zaehler=this.zaehler/this.zaehler;
		}
		else if (this.zaehler>this.nenner && this.zaehler%this.nenner == 0) {
			this.zaehler=this.zaehler/this.nenner;
			this.nenner=this.nenner/this.nenner;
		}
		else if (this.zaehler%2 == 0 && this.nenner%2 ==0) {
			this.zaehler=this.zaehler/2;
			this.nenner=this.nenner/2;
		}
		
		System.out.println("Gekürtzt: " + this.zaehler + "/" + this.nenner);
	}
	public void add(Integer v, Integer w) {
		this.zaehler += v;
		this.nenner += w;
		System.out.println("Add: " + this.zaehler + "/" + this.nenner);
	}
	
}
