package JavaLearnings;

import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {

        try {
        	

            File file = new File("/home/sj/student.txt");
            System.out.println(file.canExecute());

            if (file.createNewFile()) {

                System.out.println("File Created Successfully");
                
            } else {

                System.out.println("File Already Exists");
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}