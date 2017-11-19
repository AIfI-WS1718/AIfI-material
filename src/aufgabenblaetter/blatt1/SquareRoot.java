package aufgabenblaetter.blatt1;

public class SquareRoot {


	public static void main(String[] args) {
		double a=9.0;
		double x=6.0;
		double y=0.0;
		double z=6.0;
		
		while (x-y >= 0.0001)
		{
		x=z;
		y=(x+(a/x))/2;
		z=y;
		}
		
		System.out.println(x);
		
	}

}
