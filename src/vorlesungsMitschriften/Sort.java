package vorlesungsMitschriften;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<String> l = Arrays.asList(args);
		Collections.sort(l);
		System.out.println(l);
	}
}
