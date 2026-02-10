public class Q59_ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;
        
        while (num > 0) {
            int lastDigit = num % 10;
            // Cube the last digit and add it to sum (assuming 3-digit number for basic BCA level)
            sum = sum + (lastDigit * lastDigit * lastDigit);
            num = num / 10;
        }
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number.");
        }
    }
}