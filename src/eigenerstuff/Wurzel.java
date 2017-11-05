package eigenerstuff;

public class Wurzel {
	public static int wurzel(int zahl) {
		int golem = 1;
		while(golem<=zahl) {
			if(golem*golem == zahl){
				return golem;
			}else{
				golem = golem + 1 ;
			}
		}
		System.out.println("Zu dieser Zahl gibt es keine natürliche Wurzel!");
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(wurzel(24));
	}
}// asd

