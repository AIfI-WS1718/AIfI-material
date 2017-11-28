package vorlesung.implementationInheritance.objectExamples;

public class MyIntegerTuple /*extends Object*/ {

	Integer a;
	Integer b;
	
	@Override
	public boolean equals(Object obj) {
		// Fragezeichenoperator: Abfrage? wenn ja: wenn nein;
		return (obj instanceof MyIntegerTuple) ?
			 a.equals(((MyIntegerTuple) obj).a) && b.equals(((MyIntegerTuple) obj).b)
					 : false;
			 
		// das folgende würde das gleiche tun
//		if (obj instanceof MyIntegerTuple) {
//			MyIntegerTuple myIntegerTuple = (MyIntegerTuple) obj;
//			return a.equals(myIntegerTuple.a) && b.equals(myIntegerTuple.b);
//		}
//		return false;
	}

}
