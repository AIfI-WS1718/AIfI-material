package vorlesung.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

class Tokenizer {

	public static void main(String[] args) {
		File inputFile = new File("./src/vorlesung/io/farrago.txt");
		try ( 
				FileReader inp = new FileReader(inputFile);
				BufferedReader in = new BufferedReader(inp);
				) {
			
			String line = null;
			while ( (line = in.readLine()) != null ) {
				List<String> array = Arrays.asList( line.split(" +|\t+"));
				for (String str : array) {
					System.out.println(str);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
