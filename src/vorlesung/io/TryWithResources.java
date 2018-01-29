package vorlesung.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class TryWithResources {

	public static void main(String[] args) {
		File inputFile = new File("./src/vorlesung/io/farrago.txt");
		File outputFile = new File("./src/vorlesung/io/out.txt");
		
		try (
				// note resources in round brackets, not curly!
				FileReader in = new FileReader(inputFile);
				FileWriter out = new FileWriter(outputFile);
				) {
			
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// in und out werden geschlossen, egal ob try geklappt hat oder nicht (AutoCloseable) 
	}

}
