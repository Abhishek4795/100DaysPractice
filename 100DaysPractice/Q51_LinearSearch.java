public class Q51_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;
        
        // Check each element one by one
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break; // Stop searching once found
            }
        }
        
        if (found == false) {
            System.out.println("Element not found in the array.");
        }
    }
}