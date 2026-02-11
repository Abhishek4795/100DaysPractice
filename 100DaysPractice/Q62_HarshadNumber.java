public class Q62_HarshadNumber {
    public static void main(String[] args) {
        int num = 156;
        int temp = num;
        int sum = 0;
        
        // Find the sum of digits
        while (temp > 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }
        
        // Check divisibility
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is not a Harshad Number.");
        }
    }
}