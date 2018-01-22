package vorlesung.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

class Komprimiert {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("./src/vorlesung/io/farrago.txt");
		FileInputStream fr = new FileInputStream(inputFile);
		BufferedInputStream in = new BufferedInputStream(fr);

		File outputFile = new File("./src/vorlesung/io/outStream.txt.gz");
		FileOutputStream fw = new FileOutputStream(outputFile);
		GZIPOutputStream outGZ = new GZIPOutputStream (fw) ;
		BufferedOutputStream out = new BufferedOutputStream(outGZ);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
	}

}
