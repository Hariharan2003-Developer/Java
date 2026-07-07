package learnExceptionDemo;

class ExceptionHandling {

    public static void main(String[] args) {

        ExceptionHandling eh = new ExceptionHandling();
        ExceptionHandling eh2 = new ExceptionHandling();

        System.out.println("Hashcode of eh : " + eh);
        System.out.println(eh.hashCode());

        if (eh.equals(eh2)) {
            System.out.println("Both Objects are Equal");
        } else {
            System.out.println("Both Objects are Not Equal");
        }
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 883826107;
    }

    @Override
    public String toString() {
        return "Biriyani";
    }
}