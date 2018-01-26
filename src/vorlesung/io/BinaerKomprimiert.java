package vorlesung.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BinaerKomprimiert {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("./src/vorlesung/io/farrago.txt");
		File outputFile = new File("./src/vorlesung/io/outBinaer.txt");
		FileInputStream fr = new FileInputStream(inputFile);
		FileOutputStream fw = new FileOutputStream(outputFile);
		DataInputStream in = new DataInputStream(fr);
		DataOutputStream out = new DataOutputStream(fw);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
	}
	
}
