package vorlesung.typicalObjects;

public class StringExample {

	public static void main(String[] args) {
		String str = "test test test";
		
		System.out.println("length: " + str.length());
		System.out.println("charAt: " + str.charAt(4));
		System.out.println("substring: " + str.substring(9, 13));
		System.out.println("indexOf: " + str.indexOf("s"));
		System.out.println("lastIndexOf: " + str.lastIndexOf("t"));
		
		System.out.println("--------------");
		
		String s1 = "Hello";
		String s2 = new String(s1);
//		String s2 = s1;
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 == s2:" + (s1 == s2));
		
		int difference = s1.compareTo(s2);
		System.out.println("s1 compared to s2: " + difference);
	}

}
