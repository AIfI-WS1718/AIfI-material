package vorlesung.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class UnbufferedIO {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("./src/vorlesung/io/farrago.txt");
		File outputFile = new File("./src/vorlesung/io/outUnbuffered.txt");

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);

		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}

		in.close();
		out.close();
	}

}
