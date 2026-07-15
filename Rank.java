package JavaLearnings;

import java.util.ArrayList;

public class Rank {

    ArrayList<Student> al = new ArrayList<>();

    public void addStudent(String id, String name, int mark, int standard) {
        al.add(new Student(id, name, mark, standard));
    }

    public void displayStudents() {
        for (Student s : al) {
            System.out.println(s);
        }
    }
}