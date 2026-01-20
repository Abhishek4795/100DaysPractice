public class Q28_BasicException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("Program started...");

        try {
            // Trying to divide by zero, this will throw an ArithmeticException
            int result = a / b;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            // Catching the exception so the program doesn't crash
            System.out.println("Error: Cannot divide a number by zero!");
        }

        System.out.println("Program finished successfully.");
    }
}