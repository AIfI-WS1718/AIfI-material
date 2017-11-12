package vorlesung.staticMethods;

class staticVariables {

	static int cnt = 0;
	
	static void addOne() {
		cnt += 1;
	}
	
	static void addTwo() {
		cnt += 2;
	}
	
	public static void main(String[] args) {
		System.out.println("cnt=" + cnt);
		addOne();
		System.out.println("cnt=" + cnt);
		addTwo();
		System.out.println("cnt=" + cnt);
	}

}
