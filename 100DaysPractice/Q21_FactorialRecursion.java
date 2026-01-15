public class Q21_FactorialRecursion {
    // Recursive method to calculate factorial
    public static int getFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = getFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}