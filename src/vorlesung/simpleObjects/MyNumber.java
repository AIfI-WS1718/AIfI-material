package vorlesung.simpleObjects;

public class MyNumber {

	private double value;
	
	double getValue() {
		return value;
	}
	
	void setValue(double tmp) {
		value = tmp;
	}
	
	void addToValue(double tmp) {
		value += tmp;
	}
	
	public static void main(String[] args) {
		MyNumber aNumber = new MyNumber();
		aNumber.setValue(1.23);
		aNumber.addToValue(5.23);
	}

}
