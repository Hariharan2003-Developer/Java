package JavaLearnings;

public class Main {

    public static void main(String[] args) {

        Rank rank = new Rank();

        rank.addStudent("S101", "Hari", 95, 10);
        rank.addStudent("S102", "Kumar", 88, 11);

        rank.displayStudents();
    }
}