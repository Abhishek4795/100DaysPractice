public class Q57_GCDTwoNumbers {
    public static void main(String[] args) {
        int n1 = 36, n2 = 60;
        int gcd = 1;
        
        // Find the smaller number to run the loop
        int min = (n1 < n2) ? n1 : n2;
        
        // Run loop from 1 to min and check common factors
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}