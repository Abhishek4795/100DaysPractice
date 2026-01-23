public class Q33_PowerCalculation {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        long result = 1;
        
        // Loop exponent times and keep multiplying the base
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}