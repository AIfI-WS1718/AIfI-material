package vorlesung.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class BufferedIO {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("./src/vorlesung/io/farrago.txt");
		File outputFile = new File("./src/vorlesung/io/outBuffered.txt");
		FileReader fr = new FileReader(inputFile);
		FileWriter fw = new FileWriter(outputFile);
		BufferedReader in = new BufferedReader(fr);
		BufferedWriter out = new BufferedWriter(fw);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
	}

}
