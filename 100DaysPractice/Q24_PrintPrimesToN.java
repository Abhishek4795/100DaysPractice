public class Q24_PrintPrimesToN {
    public static void main(String[] args) {
        int limit = 20;
        System.out.println("Prime numbers up to " + limit + ":");

        // Loop through each number from 2 to limit
        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;
            
            // Check if the number is divisible by any number other than 1 and itself
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Not a prime, exit inner loop
                }
            }
            
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}