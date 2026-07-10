package JavaLearnings;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("T20.txt");

        int ch;

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();

	}

}
