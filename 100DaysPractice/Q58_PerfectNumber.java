public class Q58_PerfectNumber {
    public static void main(String[] args) {
        int num = 28; // Perfect numbers: 6, 28, 496...
        int sum = 0;
        
        // Find all proper divisors and add them
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        
        // Check if sum of divisors is equal to the original number
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
    }
}