public class Q88_CountEvenOddDigits {
    public static void main(String[] args) {
        int num = 12345678;
        int evenCount = 0;
        int oddCount = 0;
        
        while (num > 0) {
            int digit = num % 10; // Extract last digit
            
            if (digit % 2 == 0) {
                evenCount++; // It's an even digit
            } else {
                oddCount++;  // It's an odd digit
            }
            
            num = num / 10; // Remove last digit
        }
        
        System.out.println("Total Even Digits: " + evenCount);
        System.out.println("Total Odd Digits: " + oddCount);
    }
}