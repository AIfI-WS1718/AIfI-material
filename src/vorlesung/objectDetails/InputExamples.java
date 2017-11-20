package vorlesung.objectDetails;

class InputExamples {
	
	ParameterObject parameterObject;

	static void methodWithArguments(int aa, double bb, String cc) {
		System.out.println("method with multiple arguments: " + aa + ", " + bb + ", " + cc);
	}
	
	static void methodWithArguments(ParameterObject pobj) {
		System.out.println("method with a single parameter object: " + pobj.aa + ", " + pobj.bb + ", " + pobj.cc);
	}
	
	void methodWithoutArgumentsUsingFields() {
		System.out.println("method without arguments: " + parameterObject.aa + ", " + parameterObject.bb + ", " + parameterObject.cc);
	}
	
	public static void main(String[] args) {
		System.out.println("Input über die Argumentenliste:");
		// als mehrere Argumente
		methodWithArguments(342, 4567.2, "argument");
		// als ein Parameterobjekt
		methodWithArguments(new ParameterObject(942, 1, "objectString"));
		
		System.out.println("\nInput über Klassenvariablen");
		InputExamples myObject = new InputExamples();
		myObject.parameterObject = new ParameterObject(23, 54.3, "Hallo");
		myObject.methodWithoutArgumentsUsingFields();
	}
	
}
