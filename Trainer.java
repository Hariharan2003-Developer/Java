class Trainer{

    String dept;
    String institute;

    private int Salary = 10000;

    Trainer(String dept , String institute){
        this.dept = dept;
        this.institute = institute;
    }

    public int getSalary(){
        return Salary;
    }

    void training(){
        System.out.println("Kathirvel Payalungada");
    }

    public static void main(String[] args){

        Trainer trainerKumar = new Trainer("CSE" , "Payilagam");

        // trainerKumar.dept;
        // trainerKumar.institute;
        trainerKumar.getSalary();

        System.out.println("Department: " + trainerKumar.dept);
        System.out.println("Institute: " + trainerKumar.institute);
        System.out.println("Salary: " + trainerKumar.getSalary());

        trainerKumar.training();





    }

}
