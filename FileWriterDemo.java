package JavaLearnings;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("T20.txt");

        fw.write("Sanju Samson\n");
        fw.write("Jasprit Bumrah\n");
        fw.write("Abishek Sharma\n");
        fw.write("Hardik Pandya\n");
        fw.write("SuryaKumar Yadav\n");

        fw.close();

        System.out.println("Data Written Successfully.");

	}

}
