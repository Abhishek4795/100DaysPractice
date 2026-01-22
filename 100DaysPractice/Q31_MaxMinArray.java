public class Q31_MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        
        // Let's assume the first element is both max and min initially
        int maxNum = arr[0];
        int minNum = arr[0];
        
        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i]; // Update max if current element is greater
            }
            if (arr[i] < minNum) {
                minNum = arr[i]; // Update min if current element is smaller
            }
        }
        
        System.out.println("Maximum element is: " + maxNum);
        System.out.println("Minimum element is: " + minNum);
    }
}