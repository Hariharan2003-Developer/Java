class PracticeException {

    // Addition Method
    public static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    // Division Method
    public static void divide(int b, int c) {
        try {
            System.out.println("Division: " + (b / c));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    // Multiplication Method
    public static void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 0;

        add(a, b);
        divide(b, c);
        multiply(a, b);
    }
}
