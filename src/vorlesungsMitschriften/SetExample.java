package vorlesungsMitschriften;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
//		Set<Double> set = new HashSet<>();
		Set<Double> set = new TreeSet<>();
		
		for( int i=0; i<10; i++){
			double rnd = Math.random();
			set.add(rnd);
			System.out.println(rnd);
		}
		
		System.out.println("---");
		for(Double dbl : set){
			System.out.println(dbl);
		}
	}

}
