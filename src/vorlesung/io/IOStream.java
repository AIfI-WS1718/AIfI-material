package vorlesung.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class IOStream {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("./src/vorlesung/io/farrago.txt");
		File outputFile = new File("./src/vorlesung/io/outStream.txt");
		FileInputStream fr = new FileInputStream(inputFile);
		FileOutputStream fw = new FileOutputStream(outputFile);
		BufferedInputStream in = new BufferedInputStream(fr);
		BufferedOutputStream out = new BufferedOutputStream(fw);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
	}

}
