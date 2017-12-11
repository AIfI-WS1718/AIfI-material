package uebung.ue4;

public class BeliebigeKlasseKahoot {
	private static int anzahlDerObjekte = 0;
	private int zahl = 0;
	public BeliebigeKlasseKahoot (){
		anzahlDerObjekte ++;
		this.zahl ++;}
	public static int wieVieleObjecte (){
		return anzahlDerObjekte;}
	public int getZahl (){
		return this.zahl ;}
	public static void main(String[] args) {
		BeliebigeKlasseKahoot hans = new BeliebigeKlasseKahoot();
		BeliebigeKlasseKahoot peter = new BeliebigeKlasseKahoot();
		BeliebigeKlasseKahoot ina = new BeliebigeKlasseKahoot();
		System.out.println (hans.getZahl() + ", " + ina.getZahl() +
				", " + BeliebigeKlasseKahoot.wieVieleObjecte());}}
