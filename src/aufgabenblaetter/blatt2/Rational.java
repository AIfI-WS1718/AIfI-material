package aufgabenblaetter.blatt2;

class Rational {
	
	public static void main(String[] args) {
		Rational r = new Rational();
		r.setzaehler(10);
		r.setnenner(20);
		r.printRational();
		r.toDouble();
		r.add(10, 20);
		Rational rl = new Rational(3,6);
		rl.printRational();
		r.reduce();
		r.invert();
		r.printRational();
		r.negate();
		r.printRational();
		
	}

	int zaehler;
	int nenner;
	

	public Rational () {
		this.zaehler=0;
		this.nenner=1;
	}
	public Rational (int z, int n) {
		this.zaehler=z;
		this.nenner=n;
	}
	public void printRational() {
	System.out.println(zaehler + "/" + nenner);
	}
	public void setnenner(int nenner) {
		this.nenner=nenner;
	}
	public void setzaehler(int zaehler) {
		this.zaehler=zaehler;
	}
	public void negate() {
		this.nenner = -this.nenner;
		this.zaehler = -this.zaehler;
	}
	public void invert() {
		int u;
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
		int a,b;
		a=this.zaehler;
		b=this.nenner;
		if (a<b && b%a == 0) {
			b=b/a;
			a=a/a;
		}
		else if (a>b && a%b == 0) {
			a=a/b;
			b=b/b;
		}
		else if (a%2 == 0 && b%2 ==0) {
			a=a/2;
			b=b/2;
		}
		
		System.out.println("Gekürtzt: " + a + "/" + b);
	}
	public void add(int v, int w) {
		this.zaehler += v;
		this.nenner += w;
		System.out.println("Add: " + this.zaehler + "/" + this.nenner);
	}
}
