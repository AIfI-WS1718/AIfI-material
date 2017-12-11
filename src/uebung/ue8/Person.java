package uebung.ue8;

public class Person {

		int alter;
		String name;
		
		public Person (String name, int alter) {
			this.name = name;
			this.alter = alter;
		}
		
		public Person (int alter, String name) {
			this.name = name;
			this.alter = alter;
		}
		
		@Override
		public String toString() {
			return "Die Person hei" + (char) 223 + "t " + name + " und ist " + alter + " Jahre alt.";
		}
		
		public void altern() {
			this.alter += 1;
		}
}
