public class Q14_MissingNumber {
    public static void main(String[] args) {
        // Array is missing number 3
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // Since one number is missing from 1 to 6

        // Mathematical formula for sum of first N natural numbers
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        // Calculate sum of elements present in the array
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}