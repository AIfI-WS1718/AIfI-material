package vorlesung.implementationInheritance;

public class MyIntTuple {

	int a;
	int b;
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyIntTuple) {
			MyIntTuple myInt = (MyIntTuple) obj;
			if (myInt.a == a && myInt.b == b) {
				return true;
			}
		}
		return false;
	}
	
}