package JavaLearnings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		 BufferedWriter bw = new BufferedWriter(new FileWriter("ODI.txt"));
		 
		    bw.write("Rohit Sharma");
	        bw.newLine();
	        bw.write("Virat Kholi");
	        bw.newLine();
	        bw.write("KL Rahul");
	        bw.newLine();
	        bw.write("Mohammed Shami");
	        bw.newLine();

	        bw.close();

	        System.out.println("Data Written Successfully.");

	}

}
