package vorlesung.objectDetails;

class OutputExamples {
	
	int a;
	int b;

	static int methodWithPrimitiveReturnValue(int a, int b) {
		System.out.println("Rückgabe über return mittels eines primitiven Typs:");
		return a*b;
	}
	
	static ParameterObject methodWithObjectReturnValue(int a, int b) {
		System.out.println("Rückgabe mehrerer Informationen über ein Parameterobjekt:");
		return new ParameterObject(a+1, b*2, "noch mehr Infos");
	}
	
	void methodWithoutReturnUsingFields(int a, int b) {
		System.out.println("Rückgabe der Information ohne return über Veränderung der Klassenvariablen:");
		this.a = a+b;
		this.b = b*2; 
	}
	
	static void methodWithoutReturnUsingInputArguments(MyInteger int1, MyInteger int2) {
		System.out.println("Rückgabe der Information ohne return über die Argumente (funktioniert nur bei Call-By-Reference)");
		int1.value = int1.value + int2.value;
		int2.value = int2.value*2;
	}
	
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int result1 = methodWithPrimitiveReturnValue(a,b);
		System.out.println("result1: " + result1);
		ParameterObject result2 = methodWithObjectReturnValue(a,b);
		System.out.println("result2: " + result2.aa + ", " + result2.bb + ", " + result2.cc);
		
		OutputExamples outputExamples = new OutputExamples();
		outputExamples.methodWithoutReturnUsingFields(a, b);
		System.out.println("result3: " + outputExamples.a + ", " + outputExamples.b);
		
		MyInteger int1 = new MyInteger(123);
		MyInteger int2 = new MyInteger(456);
		methodWithoutReturnUsingInputArguments(int1, int2);
		System.out.println("result4: " + int1.value + ", " + int2.value);
	}

}
