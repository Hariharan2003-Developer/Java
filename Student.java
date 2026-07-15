package JavaLearnings;

public class Student {
    String id;
    String name;
    int mark;
    int standard;

    public Student(String id, String name, int mark, int standard) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.standard = standard;
    }

    
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                ", standard=" + standard +
                '}';
    }
}