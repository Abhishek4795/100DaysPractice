public class Q40_CountEvenOddArray {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78};
        int evenCount = 0;
        int oddCount = 0;
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if element is perfectly divisible by 2
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Total Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);
    }
}