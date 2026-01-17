public class Q23_SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        // Loop until the number becomes 0
        while (number > 0) {
            int lastDigit = number % 10; // Get the last digit
            sum = sum + lastDigit;       // Add it to sum
            number = number / 10;        // Remove the last digit from number
        }

        System.out.println("Sum of digits: " + sum);
    }
}