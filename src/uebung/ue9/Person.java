package uebung.ue9;

public class Person {

		int alter;
		String name;
		boolean hungry;
		
		public Person (String name, int alter) {
			this.name = name;
			this.alter = alter;
			hungry = true;
		}
		
		public Person (int alter, String name) {
			this.name = name;
			this.alter = alter;
			hungry = true;
		}
		
		@Override
		public String toString() {
			return "Die Person hei" + (char) 223 + "t " + name + " und ist " + alter + " Jahre alt.";
		}
		
		public void altern() {
			this.alter += 1;
		}
		
		public void setHungry(boolean b) {
			this.hungry = b;
		}
}
