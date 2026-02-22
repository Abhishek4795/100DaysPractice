public class Q78_CheckPrimeInterval {
    public static void main(String[] args) {
        int low = 10;
        int high = 30;
        
        System.out.println("Prime numbers between " + low + " and " + high + " are:");
        for (int num = low; num <= high; num++) {
            boolean isPrime = true;
            if (num < 2) continue; // 0 and 1 are not prime
            
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}