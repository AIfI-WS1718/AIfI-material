package aufgabenblaetter.blatt5;

public class GgT {

 public static void main(String[] args) {
	System.out.println(ggT(36,21));
}
 public static int ggT(int zahl1, int zahl2) {
	 if (zahl2 == 0) return zahl1;
	 int rest = zahl1 % zahl2;
	 return ggT(zahl2, rest);
 }
}
