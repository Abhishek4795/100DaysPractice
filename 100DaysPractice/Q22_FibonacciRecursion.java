public class Q22_FibonacciRecursion {
    // Recursive method to get the nth Fibonacci number
    public static int getFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // Sum of previous two terms
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 7; // Number of terms to print
        System.out.print("Fibonacci Series: ");
        
        for (int i = 0; i < terms; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
}