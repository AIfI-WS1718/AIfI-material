package vorlesung.staticMethods;

class MyMax {
	
	static double myMax(double aa, double bb) {
		if (aa > bb) {
			return aa;
		} else {
			return bb;
		}
	}
	
	public static void main(String[] args) {
		double a = 12;
		double b = 14;
		System.out.println("Math: " + Math.max(a, b));
		System.out.println("MyMax aus dieser Klasse: " + myMax(a, b));
		System.out.println("MyMax aus Utils: " + MyUtils.max(a, b));
	}

}
